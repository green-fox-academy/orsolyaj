package com.gfa.apisandrest.service;

import com.gfa.apisandrest.model.AppendA;
import org.springframework.stereotype.Service;

@Service
public class AppendAService {


  public AppendAService() {
  }

  public AppendA appendA(String string) {
    StringBuilder sb = new StringBuilder();
    return new AppendA( string + sb.append('a'));
  }
}
