package com.greenfox.reddit;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.repository.IPostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {
  IPostRepository postRepository;

  public RedditApplication(IPostRepository postRepository) {
    this.postRepository = postRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(RedditApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    postRepository.save(new Post("weather", "https://weather.com/"));
    postRepository.save(new Post("food", "https://www.allrecipes.com/"));
    postRepository.save(new Post("help", "https://stackoverflow.com/"));
  }
}
