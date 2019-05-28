package com.connection.sqlconnection.service;

import com.connection.sqlconnection.model.Todo;

import java.util.List;

public interface ITodoService {
  List<Todo> findAll();
  Todo findById(long Id);
  void save(Todo todo);
  void delete(long Id);
}
