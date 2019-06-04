package com.gfa.apisandrest.model;

public class MyNumber {
  private int received;
  private int result;

  public MyNumber(int recieved) {
    this.received = recieved;
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
