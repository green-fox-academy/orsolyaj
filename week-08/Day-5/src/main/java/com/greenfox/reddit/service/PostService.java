package com.greenfox.reddit.service;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.repository.IPostRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostService implements IPostService {
  private IPostRepository postRepository;

  public PostService(IPostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @Override
  public Post findById(long id) {
    return postRepository.findById(id).orElse(null);
  }

  @Override
  public List<Post> findAll() {
    List<Post> postList = new ArrayList<>();
    postRepository.findAll().forEach(post -> postList.add(post));
    return postList;
  }

  @Override
  public List<Post> sortMostLikedFirst() {
   return postRepository.findAllByOrderByLikesDesc();
//    List<Post> postList = new ArrayList<>();
//    postRepository.findAll().forEach(post -> postList.add(post));
//    List <Post> mostLiked = postList.stream()
//            .sorted(Comparator.comparing(Post ::getLikes))
//            .collect(Collectors.toList());
//    return mostLiked;
  }

  @Override
  public void save(Post post) {
    postRepository.save(post);
  }

  @Override
  public void like(long id) {
   Post post = postRepository.findById(id).orElse(null);
   post.setLikes(post.getLikes()+1);
   postRepository.save(post);
  }

  @Override
  public void dislike(long id) {
    Post post = postRepository.findById(id).orElse(null);
    post.setLikes(post.getLikes()-1);
    postRepository.save(post);
  }
}
