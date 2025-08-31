package com.nw.nwmeta.model.warbuild;

import com.nw.nwmeta.model.dto.warbuild.ComboEssencialDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class ComboEssencial {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String titulo;

    private String descricao;

    public static ComboEssencial toEntity(ComboEssencialDTO dto) {
        return ComboEssencial.builder()
                .descricao(dto.getDescricao())
                .titulo(dto.getTitulo())
                .id(dto.getId())
                .build();
    }
}
