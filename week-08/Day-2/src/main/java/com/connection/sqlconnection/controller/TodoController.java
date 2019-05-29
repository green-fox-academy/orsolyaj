package com.connection.sqlconnection.controller;

import com.connection.sqlconnection.service.ITodoService;
import com.connection.sqlconnection.service.TodoService;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {
  private TodoService todoService;

  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping("/list")
  public String list(Model model) {
    model.addAttribute("todos", todoService.findAll());
    return "todolist";
  }

  @GetMapping("/active")
  public String active(Model model) {
    model.addAttribute("todos", todoService.listActive());
    return "todolist";
  }

  @GetMapping("/delete")
  public String delete(@RequestParam Long id) {
    todoService.delete(id);
    return "redirect:/todo/list";
  }
}
