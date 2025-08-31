package com.nw.nwmeta.service;

import com.nw.nwmeta.model.dto.warbuild.ComboEssencialDTO;
import com.nw.nwmeta.model.dto.warbuild.DicaGameplayDTO;
import com.nw.nwmeta.model.warbuild.ComboEssencial;
import com.nw.nwmeta.model.warbuild.DicaGameplay;
import com.nw.nwmeta.model.warbuild.WarBuild;
import com.nw.nwmeta.model.dto.warbuild.WarBuildDTO;
import com.nw.nwmeta.model.warbuild.mapper.WarBuildMapper;
import com.nw.nwmeta.repository.warbuild.WarBuildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class WarBuildService {

    @Autowired
    WarBuildRepository warBuildRepository;

    private WarBuildMapper mapper;

    public void inserir(WarBuildDTO warBuildDTO) {
        List<ComboEssencial> comboEssencials = extrairComboEssencial(warBuildDTO.getComboEssencials());
        List<DicaGameplay> dicaGameplays = extrairDicaGameplay(warBuildDTO.getDicaGameplays());

        System.out.println(warBuildDTO);
    }

    private List<DicaGameplay> extrairDicaGameplay(List<DicaGameplayDTO> list) {
        List<DicaGameplay> dicaGameplays = new ArrayList<>();
        list.forEach(dto -> {
            DicaGameplay comboEssencial = DicaGameplay.toEntity(dto);
            dicaGameplays.add(comboEssencial);
        });
        return dicaGameplays;
    }

    private List<ComboEssencial> extrairComboEssencial(List<ComboEssencialDTO> list) {
        List<ComboEssencial> comboEssencials = new ArrayList<>();
        list.forEach(dto -> {
            ComboEssencial comboEssencial = ComboEssencial.toEntity(dto);
            comboEssencials.add(comboEssencial);
        });
        return comboEssencials;
    }

    public List<WarBuild> findAll() {
        List<WarBuild> warBuilds = warBuildRepository.findAll();
        return warBuilds;
    }

    public WarBuild findById(Integer id) {
        Optional<WarBuild> warBuildsOptional = warBuildRepository.findById(id);
        return warBuildsOptional.orElse(new WarBuild());
    }

    public void excluir(Integer id) {
        Optional<WarBuild> warBuildsOptional = warBuildRepository.findById(id);
        warBuildsOptional.ifPresent(warBuild -> warBuildRepository.delete(warBuild));
    }
}
