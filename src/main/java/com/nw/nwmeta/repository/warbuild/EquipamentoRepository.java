package com.nw.nwmeta.repository.warbuild;

import com.nw.nwmeta.model.warbuild.Equipamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipamentoRepository extends JpaRepository<Equipamento, Integer> {
}
