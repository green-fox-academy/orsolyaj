package com.gfa.apisandrest.model;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AHandler {
  private String what;
  private int[] numbers;
  private int result;

  public AHandler() {
  }

  public AHandler(String what, int[] numbers) {
    this.what = what;
    this.numbers = numbers;
    if (what.equals("sum")) {
      this.result = sum(numbers);
    } else if (what.equals("multiply")) {
      this.result = multiply(numbers);
    }
  }

  public int sum(int[] numbers) {
    int result = IntStream.of(numbers).sum();
    return result;
  }

  public int[] duplicate(int[] numbers) {
   return Arrays.stream(numbers).map(i -> i * 2).toArray();
  }

  public int multiply(int[] numbers) {
    int result = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      result= result* i ;
    }
    return result;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}

