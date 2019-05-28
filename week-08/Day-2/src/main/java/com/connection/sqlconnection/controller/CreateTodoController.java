package com.connection.sqlconnection.controller;

import com.connection.sqlconnection.model.Todo;
import com.connection.sqlconnection.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class CreateTodoController {
  private TodoService todoService;

  public CreateTodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping("/add")
  public String addTodo(Model model) {
    model.addAttribute("todo", new Todo());
    return "createtodo";
  }

  @PostMapping("/add")
  public String postTodo(Todo todo) {
    todoService.save(todo);
return "redirect:/todo/list";
  }
}
