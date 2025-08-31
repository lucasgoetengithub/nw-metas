package com.nw.nwmeta.repository.warbuild;

import com.nw.nwmeta.model.warbuild.PontoAtributo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PontoAtributoRepository extends JpaRepository<PontoAtributo, Integer> {
}
