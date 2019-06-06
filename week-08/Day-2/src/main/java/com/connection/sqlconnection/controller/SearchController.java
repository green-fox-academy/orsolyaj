package com.connection.sqlconnection.controller;

import com.connection.sqlconnection.repository.IAssigneeRepository;
import com.connection.sqlconnection.repository.ITodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SearchController {
  private IAssigneeRepository assigneeRepository;
  private ITodoRepository todoRepository;

  public SearchController(IAssigneeRepository assigneeRepository, ITodoRepository todoRepository) {
    this.assigneeRepository = assigneeRepository;
    this.todoRepository = todoRepository;
  }

  @PostMapping("todo/search")
  public String findSearchedTerm(String searchTerm) {
    todoRepository.findBySearchTermNative(searchTerm);
    return "todolist";
  }
}
