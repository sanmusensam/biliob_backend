package com.jannchie.biliob.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/** @author jannchie */
public class UserRecord {

  @Id private ObjectId id;
  private String userName;
  private String datetime;
  private String message;
  private Integer credit;
  private Boolean isExecuted;

  public UserRecord() {}

  public UserRecord(String datetime, String message, Integer credit, String userName) {
    this.datetime = datetime;
    this.message = message;
    this.credit = credit;
    this.userName = userName;
    this.isExecuted = false;
  }

  public UserRecord(
      String datetime, String message, Integer credit, String userName, Boolean isExecuted) {
    this.datetime = datetime;
    this.message = message;
    this.credit = credit;
    this.userName = userName;
    this.isExecuted = isExecuted;
  }

  public ObjectId getId() {
    return id;
  }

  public void setId(ObjectId id) {
    this.id = id;
  }

  public Boolean getExecuted() {
    return isExecuted;
  }

  public void setExecuted(Boolean executed) {
    isExecuted = executed;
  }

  public String getDatetime() {
    return datetime;
  }

  public void setDatetime(String datetime) {
    this.datetime = datetime;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Integer getCredit() {
    return credit;
  }

  public void setCredit(Integer credit) {
    this.credit = credit;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
}
