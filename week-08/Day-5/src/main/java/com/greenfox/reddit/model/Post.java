package com.greenfox.reddit.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "post")
@Setter
@Getter
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String title;
  private String source;
  private long likes;

  public Post() {
    this.likes = 0;
  }

  public Post(String title, String source) {
    this.title = title;
    this.source = source;
  }
}
