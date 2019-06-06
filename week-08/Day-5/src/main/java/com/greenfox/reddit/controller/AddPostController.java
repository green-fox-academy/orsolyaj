package com.greenfox.reddit.controller;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fakereddit")
public class AddPostController {
  PostService postService;

  public AddPostController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping("/addpost")
  public String renderAddPost(Model model) {
    model.addAttribute("post", new Post());
    return "addpost";
  }

  @PostMapping("/addpost")
  public String addPost(Post post) {
    postService.save(post);
    return "redirect:/fakereddit/home";
  }
}
