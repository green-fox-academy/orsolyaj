package com.gfa.apisandrest.model;

public class ErrorModel {
  private String error;

  public ErrorModel(String message) {
    this.error = message;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
