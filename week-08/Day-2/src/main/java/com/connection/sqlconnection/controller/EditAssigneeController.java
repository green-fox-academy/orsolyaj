package com.connection.sqlconnection.controller;

import com.connection.sqlconnection.model.Assignee;
import com.connection.sqlconnection.model.Todo;
import com.connection.sqlconnection.service.AssigneeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class EditAssigneeController {
  private AssigneeService assigneeService;

  public EditAssigneeController(AssigneeService assigneeService) {
    this.assigneeService = assigneeService;
  }
  @GetMapping("/editassignee")
  public String addAssignee(@RequestParam Long id, Model model) {
    model.addAttribute("assignee",assigneeService.findById(id) );
    return "editassignee";
  }

  @PostMapping("/editassignee")
  public String postAsignee(@RequestParam Long id, Assignee assignee) {
    assigneeService.save(assignee);
    return "redirect:/todo/assigneelist";
  }

}
