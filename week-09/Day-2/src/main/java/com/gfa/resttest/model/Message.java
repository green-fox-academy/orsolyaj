package com.gfa.resttest.model;

public class Message {
  private String message;
  private String translation;

  public Message() {
  }

  public Message(String message) {
    this.message = message;
    this.translation = "I am Groot!";
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getTranslation() {
    return translation;
  }

  public void setTranslation(String translation) {
    this.translation = translation;
  }
}
