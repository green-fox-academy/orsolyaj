package com.connection.sqlconnection.controller;

import com.connection.sqlconnection.model.Todo;
import com.connection.sqlconnection.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class EditTodoController {
  private TodoService todoService;

  public EditTodoController(TodoService todoService) {
    this.todoService = todoService;
  }
  @GetMapping("/edit")
  public String addTodo(@RequestParam Long id, Model model) {
    model.addAttribute("todo", todoService.findById(id));
    return "edittodo";
  }

  @PostMapping("/edit")
  public String postTodo(@RequestParam Long id, Todo todo) {
    todoService.save(todo);
    return "redirect:/todo/list";
  }
}
