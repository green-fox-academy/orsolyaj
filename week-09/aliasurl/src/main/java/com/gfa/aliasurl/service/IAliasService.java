package com.gfa.aliasurl.service;

import com.gfa.aliasurl.model.AliasModel;

import java.util.List;

public interface IAliasService {
  boolean containsId(long id);
  List<AliasModel> findAll();
  AliasModel findById(long id);
  AliasModel findByAlias(String string);
  boolean containsAlias(String Alias);
  void save(AliasModel aliasModel);
  void delete(long id);
  void incrementHitcount(String alias);
}
