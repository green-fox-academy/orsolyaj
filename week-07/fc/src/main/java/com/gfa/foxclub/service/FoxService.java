package com.gfa.foxclub.service;

import com.gfa.foxclub.model.Fox;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Qualifier("foxservice")
public class FoxService {
  private List<Fox> foxList;

  public FoxService() {
    this.foxList = new ArrayList<>();
  }

  public void addFox(String name) {
    if (this.foxList.isEmpty()) {
      this.foxList.add(new Fox(name));
    } else if (this.foxList.isEmpty() == false && this.foxList.contains(foxByName(name)) == false) {
      this.foxList.add(new Fox(name));
    } else
      System.out.println("Fox already exists");
  }

  public Fox foxByName(String name) {
    List<Fox> fox = this.foxList.stream()
            .filter(f -> f.getName().equals(name))
            .collect(Collectors.toList());
    return fox.get(0);
  }

  public int trickCount(String name) {
    return foxByName(name).getTrickList().size();
  }
}
