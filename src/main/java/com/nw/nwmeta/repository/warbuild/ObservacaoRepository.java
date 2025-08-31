package com.nw.nwmeta.repository.warbuild;

import com.nw.nwmeta.model.warbuild.Observacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObservacaoRepository extends JpaRepository<Observacao, Integer> {
}
