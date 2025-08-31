package com.nw.nwmeta.service;

import com.nw.nwmeta.model.dto.warbuild.*;
import com.nw.nwmeta.model.warbuild.*;
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

    public void inserir(WarBuildDTO warBuildDTO) {
        List<ComboEssencial> comboEssencials = extrairComboEssencial(warBuildDTO.getComboEssencials());
        List<DicaGameplay> dicaGameplays = extrairDicaGameplay(warBuildDTO.getDicaGameplays());
        List<Equipamento> equipamentos = extrairEquipamentos(warBuildDTO.getEquipamentos());
        List<Observacao> observacaos = extrairObservacoes(warBuildDTO.getObservacao());
        List<PontoAtributo> pontoAtributos = extrairAtributos(warBuildDTO.getAtributos());

        WarBuild warBuild = WarBuild.toEntity(warBuildDTO);
        warBuild.setComboEssencials(comboEssencials);
        warBuild.setDicaGameplays(dicaGameplays);
        warBuild.setEquipamentos(equipamentos);
        warBuild.setObservacao(observacaos);
        warBuild.setAtributos(pontoAtributos);

        warBuildRepository.save(warBuild);
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

    private List<PontoAtributo> extrairAtributos(List<PontoAtributoDTO> list) {
        List<PontoAtributo> atributos = new ArrayList<>();
        list.forEach(dto -> {
            PontoAtributo pontoAtributo = PontoAtributo.toEntity(dto);
            atributos.add(pontoAtributo);
        });
        return atributos;
    }

    private List<Observacao> extrairObservacoes(List<ObservacaoDTO> list) {
        List<Observacao> observacaos = new ArrayList<>();
        list.forEach(dto -> {
            Observacao observacao = Observacao.toEntity(dto);
            observacaos.add(observacao);
        });
        return observacaos;
    }

    private List<Equipamento> extrairEquipamentos(List<EquipamentoDTO> list) {
        List<Equipamento> equipamentos = new ArrayList<>();
        list.forEach(dto -> {
            Equipamento equipamento = Equipamento.toEntity(dto);
            equipamentos.add(equipamento);
        });
        return equipamentos;
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
}
