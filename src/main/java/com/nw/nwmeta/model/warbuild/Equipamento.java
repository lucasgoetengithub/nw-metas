package com.nw.nwmeta.model.warbuild;

import com.nw.nwmeta.model.constants.TipoEquipamento;
import com.nw.nwmeta.model.dto.warbuild.EquipamentoDTO;
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
public class Equipamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private TipoEquipamento tipoEquipamento;

    private String linkImagem;

    public static Equipamento toEntity(EquipamentoDTO dto) {
        return Equipamento.builder()
                .id(dto.getId())
                .nome(dto.getNome())
                .tipoEquipamento(dto.getTipoEquipamento())
                .linkImagem(dto.getLinkImagem())
                .build();
    }
}
