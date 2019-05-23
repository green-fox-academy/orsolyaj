package com.day3.dependecy.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Qualifier("studentService")
public class StudentService {
  ArrayList<String> names;

  public StudentService() {
    names = new ArrayList<>();
    names.add("Sanyi");
    names.add("Lilla");
    names.add("John");
    names.add("jani");
  }

  public List<String> findAll() {
    return names;
  }

  public void save(String student) {
    names.add(student);
  }

  public  int counter() {
    return names.size();
  }

  public String containsIt(String name) {
    if(names.contains(name)) {
      return "list contains name";
    } else return "list doesnt contain name";
  }

}
