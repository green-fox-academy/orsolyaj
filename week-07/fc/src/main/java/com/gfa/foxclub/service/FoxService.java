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
  private List<String> actionList;

  public FoxService() {
    this.foxList = new ArrayList<>();
    this.actionList = new ArrayList<>();
  }

  public void addFox(String name) {
//    if (this.foxList.isEmpty()) {
//      this.foxList.add(new Fox(name));
//    } else if (this.foxList.contains(foxByName(name))== false) {
//      this.foxList.add(new Fox(name));
//    } else
//      System.out.println("Fox already exists");
    if (foxList.contains(name) == false) {
      this.foxList.add(new Fox(name));
      this.actionList.add("Created fox" + name);
    }
  }

  public Fox foxByName(String name) {
//    List<Fox> fox = this.foxList.stream()
//            .filter(f -> f.getName().equals(name))
//            .collect(Collectors.toList());
//    return fox.get(0);
    return foxList.stream()
            .filter(fox -> fox.getName().equals(name))
            .findAny()
            .orElse(null);
  }

  public int trickCount(String name) {
    return foxByName(name).getTrickList().size();
  }

  public void logAction(String action) {
    this.actionList.add(action);
  }

  public List<String> getLast5() {
    List<String> last5Actions;
    if (actionList.isEmpty()) {
      return null;
    } else {
      last5Actions = actionList.stream()
              .skip(actionList.size() - 5)
              .collect(Collectors.toList());
      return last5Actions;
    }
  }

  public List<Fox> getFoxList() {
    return foxList;
  }

  public void setFoxList(List<Fox> foxList) {
    this.foxList = foxList;
  }

  public List<String> getActionList() {
    return actionList;
  }

  public void setActionList(List<String> actionList) {
    this.actionList = actionList;
  }
}
