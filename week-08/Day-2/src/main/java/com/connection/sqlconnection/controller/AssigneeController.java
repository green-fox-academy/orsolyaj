package com.connection.sqlconnection.controller;

import com.connection.sqlconnection.service.AssigneeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class AssigneeController {
  private AssigneeService assigneeService;

  public AssigneeController(AssigneeService assigneeService) {
    this.assigneeService = assigneeService;
  }

  @GetMapping("/assigneelist")
  public String renderAssigneeList(Model model) {
    model.addAttribute("assignees", assigneeService.findAll());
    return "assignees";
  }

  @GetMapping("/deleteassignee")
  public String deleteAssignee(@RequestParam Long id) {
    assigneeService.delete(id);
    return "redirect:/todo/assigneelist";
  }
}
