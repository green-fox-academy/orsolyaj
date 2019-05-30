package com.connection.sqlconnection.service;

import com.connection.sqlconnection.model.Assignee;
import com.connection.sqlconnection.model.Todo;

import java.util.List;

public interface IAssigneeService {
  List<Assignee> findAll();
  Assignee findById(long Id);
  void save(Assignee assignee);
  void delete(long Id);
}
