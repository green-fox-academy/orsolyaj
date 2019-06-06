package com.gfa.aliasurl.service;

import com.gfa.aliasurl.model.AliasModel;
import com.gfa.aliasurl.repository.IAliasRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AliasService implements IAliasService {
  private IAliasRepository aliasRepository;

  public AliasService(IAliasRepository aliasRepository) {
    this.aliasRepository = aliasRepository;
  }

  @Override
  public boolean containsId(long id) {
    return aliasRepository.existsById(id);
  }

  @Override
  public List<AliasModel> findAll() {
    List<AliasModel> aliasModelList = new ArrayList<>();
    aliasRepository.findAll().forEach(aliasModel -> aliasModelList.add(aliasModel));
    return aliasModelList;
  }

  @Override
  public AliasModel findById(long id) {
    return aliasRepository.findById(id).orElse(null);
  }

  @Override
  public AliasModel findByAlias(String string) {
    return  aliasRepository.findByAlias(string);
  }

  @Override
  public boolean containsAlias(String alias) {
    return aliasRepository.existsByAlias(alias);
  }

  @Override
  public void save(AliasModel aliasModel) {
    aliasRepository.save(aliasModel);
  }

  @Override
  public void delete(long id) {
    aliasRepository.existsById(id);
  }

  @Override
  public void incrementHitcount(String alias) {
    AliasModel foundAMOdel = aliasRepository.findByAlias(alias);
    foundAMOdel.setHitcount(foundAMOdel.getHitcount() + 1);
    aliasRepository.save(foundAMOdel);
  }
}
