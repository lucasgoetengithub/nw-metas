package com.nw.nwmeta.model.warbuild;

import com.nw.nwmeta.model.dto.warbuild.DicaGameplayDTO;
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
public class DicaGameplay {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String titulo;

    private String descricao;

    public static DicaGameplay toEntity(DicaGameplayDTO dto) {
        return DicaGameplay.builder()
                .id(dto.getId())
                .titulo(dto.getTitulo())
                .descricao(dto.getDescricao())
                .build();
    }
}
