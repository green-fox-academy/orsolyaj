package com.greenfox.reddit.service;

import com.greenfox.reddit.model.Post;

import java.util.List;

public interface IPostService {
  Post findById(long id);
  List<Post> findAll();
  List<Post>  sortMostLikedFirst();
  void save(Post post);
  void like(long id);
  void dislike(long id);
}
