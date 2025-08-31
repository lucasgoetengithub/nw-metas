package com.nw.nwmeta.repository.warbuild;

import com.nw.nwmeta.model.warbuild.DicaGameplay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DicaGameplayRepository extends JpaRepository<DicaGameplay, Integer> {
}
