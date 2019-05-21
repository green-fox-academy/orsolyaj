package com.bank.model;

import java.text.DecimalFormat;

public class BankAccount {
  private String name;
  private long balance ;
  private String animalType;
  private boolean king;
  private String sex;
  private boolean moral;

  public BankAccount(String name, long balance, String animalType, boolean moral) {
    if (name.equals("Simba")) {
      this.king = true;
    } else this.king = false;
    this.name = name;
    this.balance =balance;
    this.animalType = animalType;
    this.moral= moral;
  }

  public BankAccount() {
  }

  public long raise() {
    if (this.king) {
      this.balance += 100;
    } else {
      this.balance += 10;
    }
    return balance;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getBalance() {
    return balance;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public boolean isKing() {
    return king;
  }

  public void setKing(boolean king) {
    this.king = king;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public boolean isMoral() {
    return moral;
  }

  public void setMoral(boolean moral) {
    this.moral = moral;
  }
}


