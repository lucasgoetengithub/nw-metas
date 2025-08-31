package com.nw.nwmeta.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.List;

@Converter
public class ListToJsonConverter implements AttributeConverter<List<?>, String> {

    private static final ObjectMapper mapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(List<?> attribute) {
        try {
            return attribute == null ? null : mapper.writeValueAsString(attribute);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Erro ao converter lista para JSON", e);
        }
    }

    @Override
    public List<?> convertToEntityAttribute(String dbData) {
        try {
            return dbData == null ? null : mapper.readValue(dbData, List.class);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao converter JSON para lista", e);
        }
    }
}
