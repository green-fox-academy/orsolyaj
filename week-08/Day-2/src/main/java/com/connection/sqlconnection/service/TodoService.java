package com.connection.sqlconnection.service;

import com.connection.sqlconnection.model.Todo;
import com.connection.sqlconnection.repository.ITodoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService implements ITodoService{
  private ITodoRepository todoRepository;

  public TodoService(ITodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }


  @Override
  public List<Todo> findAll() {
    List<Todo> todoList = new ArrayList<>();
    todoRepository.findAll().forEach(todo -> todoList.add(todo));
    return todoList;
  }

  @Override
  public Todo findById(long Id) {
    return todoRepository.findById(Id).orElse(null);
  }

  @Override
  public void save(Todo todo) {
    todoRepository.save(todo);
  }

  @Override
  public void delete(long Id) {
  }

  public List<Todo> listActive() {
    List<Todo> todoList = new ArrayList<>();
    todoRepository.findAll().forEach(todo -> todoList.add(todo));
     List<Todo> activeList = todoList.stream()
             .filter(todo -> !todo.isDone())
             .collect(Collectors.toList());
    return activeList;
  }
}
