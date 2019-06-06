package com.connection.sqlconnection.repository;

import com.connection.sqlconnection.model.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ITodoRepository extends CrudRepository<Todo,Long> {
  @Query(value = "SELECT * FROM todo WHERE" +
  "LOWER(todo.title) LIKE LOWER(CONCAT('%',:searchTerm,'%'))"+
  "LOWER(todo.created_at) LIKE LOWER(CONCAT(%, searchTerm,%))",
  nativeQuery = true
  )
  List<Todo> findBySearchTermNative(@Param("searchTerm") String searchTerm);
}
