package com.nw.nwmeta.model.warbuild;

import com.nw.nwmeta.model.constants.Atributos;
import com.nw.nwmeta.model.dto.warbuild.PontoAtributoDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class PontoAtributo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Atributos atributos;

    private Integer quantidade;

    private String descricao;

    public static PontoAtributo toEntity(PontoAtributoDTO dto) {
        return PontoAtributo.builder()
                .id(dto.getId())
                .atributos(dto.getAtributos())
                .quantidade(dto.getQuantidade())
                .descricao(dto.getDescricao())
                .build();
    }
}
