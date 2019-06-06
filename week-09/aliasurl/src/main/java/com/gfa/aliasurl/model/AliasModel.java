package com.gfa.aliasurl.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Random;

@Entity
public class AliasModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String url;
  private String alias;
  @JsonIgnore
  private long secretCode;
  private int hitcount;

  public AliasModel() {
    this.secretCode = new Random().nextInt(9000) + 1000;
    this.hitcount = 0;
  }

  public AliasModel(String url, String alias) {
    this.url = url;
    this.alias = alias;
    this.secretCode = new Random().nextInt(9000) + 1000;
    this.hitcount = 0;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getSecretCode() {
    return secretCode;
  }

  public void setSecretCode(long secretCode) {
    this.secretCode = secretCode;
  }

  public int getHitcount() {
    return hitcount;
  }

  public void setHitcount(int hitcount) {
    this.hitcount = hitcount;
  }
}
