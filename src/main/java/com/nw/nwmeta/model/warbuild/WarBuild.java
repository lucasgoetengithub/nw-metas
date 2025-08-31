package com.nw.nwmeta.model.warbuild;

import com.nw.nwmeta.model.constants.Armas;
import com.nw.nwmeta.model.constants.Categoria;
import com.nw.nwmeta.model.constants.Dificuldade;
import com.nw.nwmeta.model.dto.warbuild.WarBuildDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class WarBuild {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String criador;
    private String nome;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private Armas arma1;

    @Enumerated(EnumType.STRING)
    private Armas arma2;

    private String caracteristicaTipo;

    @Enumerated(EnumType.STRING)
    private Dificuldade caracteristicaDificuldade;

    @Enumerated(EnumType.STRING)
    private Categoria caracteristicaCategoria;

    private Integer catacteristicaAvaliacao;

    private String porqueDistribuicao;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="warbuild_id")
    private List<Equipamento> equipamentos;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="warbuild_id")
    private List<DicaGameplay> dicaGameplays;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="warbuild_id")
    private List<ComboEssencial> comboEssencials;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="warbuild_id")
    private List<Observacao> observacao;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="warbuild_id")
    private List<PontoAtributo> atributos;


    public static WarBuild toEntity(WarBuildDTO dto) {
        return WarBuild.builder()
                .id(dto.getId())
                .criador(dto.getCriador())
                .nome(dto.getNome())
                .descricao(dto.getDescricao())
                .arma1(dto.getArma1())
                .arma2(dto.getArma2())
                .caracteristicaTipo(dto.getCaracteristicaTipo())
                .caracteristicaDificuldade(dto.getCaracteristicaDificuldade())
                .caracteristicaCategoria(dto.getCaracteristicaCategoria())
                .catacteristicaAvaliacao(dto.getCatacteristicaAvaliacao())
                .porqueDistribuicao(dto.getPorqueDistribuicao())
                .build();
    }
}
