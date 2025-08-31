package com.nw.nwmeta.controller;

import com.nw.nwmeta.model.warbuild.WarBuild;
import com.nw.nwmeta.model.dto.warbuild.WarBuildDTO;
import com.nw.nwmeta.service.WarBuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/war-build")
public class WarBuildController {

    @Autowired
    WarBuildService warBuildService;

    @PostMapping("/save")
    public void save(@RequestBody WarBuildDTO warBuild) {
        warBuildService.inserir(warBuild);
    }

    @DeleteMapping("/delete")
    public void delete(@PathVariable Integer id) {
        warBuildService.excluir(id);
    }

    @GetMapping("/find-all")
    public List<WarBuild> findAll() {
        return warBuildService.findAll();
    }

    @GetMapping("/find-by-id")
    public WarBuild findById(@PathVariable Integer id) {
        return warBuildService.findById(id);
    }

}
