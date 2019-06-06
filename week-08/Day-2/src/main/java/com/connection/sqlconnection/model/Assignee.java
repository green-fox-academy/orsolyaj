package com.connection.sqlconnection.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "assignee")
@Getter
@Setter
public class Assignee {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String email;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "assignee")
  private List<Todo> todos;

  public Assignee() {
    this.todos = new ArrayList<>();
  }

  public Assignee(String name) {
    this.todos = new ArrayList<>();
    this.name = name;
  }
}
