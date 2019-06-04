package com.gfa.apisandrest.service;

import com.gfa.apisandrest.model.MyNumber;
import org.springframework.stereotype.Service;

@Service
public class DoublingService {

  public MyNumber doubling(int intNumber) {
    MyNumber number = new MyNumber(intNumber);
    number.setResult(number.getReceived()*2);
    return number;
  }

  public MyNumber sum(int intNumber) {
    MyNumber number = new MyNumber(0);
    number.setResult(number.getReceived());
    for (int i = 1; i < intNumber+1; i++) {
      number.setResult(number.getResult() + i);
    }
    return number;
  }

  public MyNumber factor(int intNumber) {
    MyNumber number = new MyNumber(intNumber);
    number.setResult(fact(number.getReceived()));
    return number;
  }


  public int fact(int n)
  {
    int output;
    if(n==1){
      return 1;
    }
    output = fact(n-1)* n;
    return output;
  }

}
