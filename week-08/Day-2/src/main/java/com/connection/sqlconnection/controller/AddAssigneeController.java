package com.connection.sqlconnection.controller;

import com.connection.sqlconnection.model.Assignee;
import com.connection.sqlconnection.model.Todo;
import com.connection.sqlconnection.service.AssigneeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class AddAssigneeController {
  private AssigneeService assigneeService;

  public AddAssigneeController(AssigneeService assigneeService) {
    this.assigneeService = assigneeService;
  }

  @GetMapping("/addassignee")
  public String renderAddAssignee(Model model) {
    model.addAttribute("assignee", new Assignee());
    return "addassignee";
  }

  @PostMapping("/addassignee")
  public String postAssignee(Assignee assignee) {
    assigneeService.save(assignee);
    return "redirect:/todo/assigneelist";
  }
}
