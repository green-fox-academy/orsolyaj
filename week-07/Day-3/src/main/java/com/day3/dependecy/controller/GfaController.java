package com.day3.dependecy.controller;

import com.day3.dependecy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GfaController {
  @Autowired
  @Qualifier("studentService")
  StudentService studentService;

  @GetMapping("/gfa")
  public String homePage(Model model) {
    model.addAttribute("count",studentService.counter());
    return "gfa";
  }

  @GetMapping("/gfa/list")
  public String listPage(Model model) {
    model.addAttribute("student", studentService);
    return "gfalist";
  }

  @GetMapping("/gfa/form")
  public String showForm() {
    return "gfaform";
  }

  @PostMapping("/gfa/form")
  public String addStudent(String name) {
    studentService.save(name);
    return "redirect:/gfa/list";
  }

  @GetMapping("/gfa/check")
  public String nameCheck() {
    return "namecheckform";
  }

  @PostMapping("/gfa/check")
  public String namecheckin(String name, Model model) {
    model.addAttribute("text", studentService.containsIt(name));
    return "namecheckform";
  }
}
