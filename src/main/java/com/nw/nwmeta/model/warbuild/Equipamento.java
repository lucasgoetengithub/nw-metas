package com.nw.nwmeta.model.warbuild;

import com.nw.nwmeta.model.constants.TipoEquipamento;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Equipamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private TipoEquipamento tipoEquipamento;

    private String linkImagem;
}
