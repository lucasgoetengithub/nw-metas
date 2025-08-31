package com.nw.nwmeta.model.dto.warbuild;

import com.nw.nwmeta.model.constants.Armas;
import com.nw.nwmeta.model.constants.Categoria;
import com.nw.nwmeta.model.constants.Dificuldade;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WarBuildDTO {

    private Integer id;
    private String criador;
    private String nome;
    private String descricao;
    private Armas arma1;
    private Armas arma2;
    private String caracteristicaTipo;
    private Dificuldade caracteristicaDificuldade;
    private Categoria caracteristicaCategoria;
    private Integer catacteristicaAvaliacao;
    private String porqueDistribuicao;

    private List<EquipamentoDTO> equipamentos;

    private List<DicaGameplayDTO> dicaGameplays;
    private List<ComboEssencialDTO> comboEssencials;
    private List<ObservacaoDTO> observacao;
    private List<PontoAtributoDTO> atributos;

}
