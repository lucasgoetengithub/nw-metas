package com.nw.nwmeta.model.dto.warbuild;

import com.nw.nwmeta.model.constants.TipoObservacao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ObservacaoDTO {

    private Integer id;

    private TipoObservacao tipoObservacao;

    private String descricao;
}
