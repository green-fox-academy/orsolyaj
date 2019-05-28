package com.connection.sqlconnection.repository;

import com.connection.sqlconnection.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface ITodoRepository extends CrudRepository<Todo,Long> {
}
