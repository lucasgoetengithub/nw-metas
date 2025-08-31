package com.nw.nwmeta.repository.warbuild;

import com.nw.nwmeta.model.warbuild.WarBuild;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarBuildRepository extends JpaRepository<WarBuild, Integer> {
}
