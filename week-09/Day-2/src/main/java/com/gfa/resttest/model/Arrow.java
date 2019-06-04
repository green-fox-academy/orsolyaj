package com.gfa.resttest.model;

public class Arrow {
  private int distance;
  private int time;
  private int speed;

  public Arrow() {
  }

  public Arrow(int distance, int time) {
    this.distance = distance;
    this.time = time;
    this.speed = distance/time;
  }

  public int getDistance() {
    return distance;
  }

  public void setDistance(int distance) {
    this.distance = distance;
  }

  public int getTime() {
    return time;
  }

  public void setTime(int time) {
    this.time = time;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }
}
