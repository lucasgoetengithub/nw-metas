package com.nw.nwmeta.model.warbuild;

import com.nw.nwmeta.model.constants.TipoObservacao;
import com.nw.nwmeta.model.dto.warbuild.ObservacaoDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Observacao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private TipoObservacao tipoObservacao;

    private String descricao;

    public Observacao toEntity(ObservacaoDTO dto) {
        return Observacao.builder()
                .id(dto.getId())
                .tipoObservacao(dto.getTipoObservacao())
                .descricao(dto.getDescricao())
                .build();
    }
}
