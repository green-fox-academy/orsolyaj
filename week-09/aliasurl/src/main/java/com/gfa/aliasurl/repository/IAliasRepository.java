package com.gfa.aliasurl.repository;

import com.gfa.aliasurl.model.AliasModel;
import org.springframework.data.repository.CrudRepository;

public interface IAliasRepository extends CrudRepository<AliasModel, Long> {
  boolean existsById(Long id);
  boolean existsByAlias(String string);
  AliasModel findByAlias(String string);
}
