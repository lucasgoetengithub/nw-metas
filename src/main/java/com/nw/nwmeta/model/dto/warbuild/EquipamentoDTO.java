package com.nw.nwmeta.model.dto.warbuild;

import com.nw.nwmeta.model.constants.TipoEquipamento;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EquipamentoDTO {
    private Integer id;
    private String nome;
    private TipoEquipamento tipoEquipamento;
    private String linkImagem;
}
