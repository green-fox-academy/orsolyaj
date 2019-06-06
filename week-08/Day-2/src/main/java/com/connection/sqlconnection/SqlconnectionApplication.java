package com.connection.sqlconnection;

import com.connection.sqlconnection.model.Assignee;
import com.connection.sqlconnection.model.Todo;
import com.connection.sqlconnection.repository.IAssigneeRepository;
import com.connection.sqlconnection.repository.ITodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SqlconnectionApplication implements CommandLineRunner {
  private ITodoRepository todoRepository;
  private IAssigneeRepository assigneeRepository;

  public SqlconnectionApplication(ITodoRepository todoRepository, IAssigneeRepository assigneeRepository) {
    this.todoRepository = todoRepository;
    this.assigneeRepository = assigneeRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(SqlconnectionApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("Walk imaginary dog"));
    todoRepository.save(new Todo("DO homework"));
    todoRepository.save(new Todo("hidrate"));
    assigneeRepository.save(new Assignee("Juli"));
    assigneeRepository.save(new Assignee("Mari"));


  }
}
