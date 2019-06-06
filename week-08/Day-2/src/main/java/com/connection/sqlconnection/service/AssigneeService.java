package com.connection.sqlconnection.service;

import com.connection.sqlconnection.model.Assignee;
import com.connection.sqlconnection.model.Todo;
import com.connection.sqlconnection.repository.IAssigneeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssigneeService implements IAssigneeService {
  private IAssigneeRepository assigneeRepository;

  public AssigneeService(IAssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }

  @Override
  public List<Assignee> findAll() {
    List<Assignee> assigneeList = new ArrayList<>();
    assigneeRepository.findAll().forEach(assignee -> assigneeList.add(assignee));
    return assigneeList;
  }

  @Override
  public Assignee findById(long Id) {
    return assigneeRepository.findById(Id).orElse(null);
  }

  @Override
  public void save(Assignee assignee) {
    assigneeRepository.save(assignee);
  }

  @Override
  public void delete(long Id) {
    assigneeRepository.deleteById(Id);

  }
}
