package com.gfa.foxclub.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Qualifier("trick")
public class TrickService {
  List<String> trickList;

  public TrickService() {
    this.trickList = Arrays.asList("back flip", "fender drag", "yurchenko");
  }

  public List<String> getTrickList() {
    return trickList;
  }

  public void setTrickList(List<String> trickList) {
    this.trickList = trickList;
  }
}
