package com.greenfox.reddit.repository;

import com.greenfox.reddit.model.Post;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IPostRepository extends CrudRepository<Post, Long> {


  List<Post> findAllByOrderByLikesDesc();
}
