package com.greenfox.reddit.controller;

import com.greenfox.reddit.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/fakereddit")
public class HomeController {
  private PostService postService;

  public HomeController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping("/home")
  public String renderHomePage(Model model) {
    model.addAttribute("postList", postService.sortMostLikedFirst());
    return "index";
  }

  @GetMapping("/like")
  public String likePost(@RequestParam long id) {
    postService.like(id);
    return "redirect:/fakereddit/home";
  }
}
