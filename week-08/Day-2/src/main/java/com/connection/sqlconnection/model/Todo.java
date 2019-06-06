package com.connection.sqlconnection.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "todo")
@Getter
@Setter
public class Todo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private boolean urgent;
  private boolean done;
  @Temporal(TemporalType.TIMESTAMP)
  private Date createdAt;
  @ManyToOne(fetch = FetchType.EAGER)
  private Assignee assignee;


  public Todo(String title) {
    this.title = title;
    this.urgent = false;
    this.done = false;
    this.createdAt = new Date();
  }

  public Todo() {
    this.urgent = false;
    this.done = false;
    this.createdAt = new Date();
  }

//  public Long getId() {
//    return id;
//  }
//
//  public void setId(Long id) {
//    this.id = id;
//  }
//
//  public String getTitle() {
//    return title;
//  }
//
//  public void setTitle(String title) {
//    this.title = title;
//  }
//
//  public boolean isUrgent() {
//    return urgent;
//  }
//
//  public void setUrgent(boolean urgent) {
//    this.urgent = urgent;
//  }
//
//  public boolean isDone() {
//    return done;
//  }
//
//  public void setDone(boolean done) {
//    this.done = done;
//  }
}
