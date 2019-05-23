package com.gfa.foxclub.service;

import com.gfa.foxclub.model.Fox;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Qualifier("foxservice")
public class FoxService {
  private List<Fox> foxList;


  public FoxService() {
    this.foxList = new ArrayList<>();
  }

  public void addFox(String name) {
    foxList.add(new Fox(name));
  }

  public boolean listHas(String name) {
    if (foxList.contains(name)) {
      return true;
    } else {
      return false;
    }
  }

}
