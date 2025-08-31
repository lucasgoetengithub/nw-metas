package com.nw.nwmeta.model.dto.warbuild;

import com.nw.nwmeta.model.constants.Atributos;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PontoAtributoDTO {

    private Integer id;

    private Atributos atributos;

    private Integer quantidade;

    private String descricao;
}
