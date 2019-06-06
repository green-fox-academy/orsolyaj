package com.connection.sqlconnection.controller;

import com.connection.sqlconnection.model.Todo;
import com.connection.sqlconnection.service.AssigneeService;
import com.connection.sqlconnection.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {
  private TodoService todoService;
  private AssigneeService assigneeService;

  public TodoController(TodoService todoService, AssigneeService assigneeService) {
    this.todoService = todoService;
    this.assigneeService = assigneeService;
  }

  @GetMapping("/list")
  public String renderList(Model model) {
    model.addAttribute("todos", todoService.findAll());
    model.addAttribute("assignees", assigneeService.findAll());
    return "todolist";
  }

  @GetMapping("/changeslave")
  public String changeSlave(@RequestParam long id, @RequestParam long toid) {
//    todoService.findById(toid).setAssignee(assigneeService.findById(id));
//    todoService.save(todoService.findById(toid).setAssignee(assigneeService.findById(id)));
    Todo todo = todoService.findById(toid);
    todo.setAssignee(assigneeService.findById(id));
    todoService.save(todo);
    return "redirect:/todo/list";
  }

  @PostMapping("/list")
  public String postChosenAssignee(@RequestParam long assignee_id,Todo todo) {
return "redirect:/todo/list";
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
