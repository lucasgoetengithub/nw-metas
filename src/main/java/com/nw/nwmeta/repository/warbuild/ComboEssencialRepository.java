package com.nw.nwmeta.repository.warbuild;

import com.nw.nwmeta.model.warbuild.ComboEssencial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComboEssencialRepository extends JpaRepository<ComboEssencial, Integer> {
}
