package com.chunyue.project.model;


public class Remarks {

  private long id;
  private String dtr;
  private String dtrmess;
  private String ctr;
  private String ctrmess;
  private long state;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getDtr() {
    return dtr;
  }

  public void setDtr(String dtr) {
    this.dtr = dtr;
  }


  public String getDtrmess() {
    return dtrmess;
  }

  public void setDtrmess(String dtrmess) {
    this.dtrmess = dtrmess;
  }


  public String getCtr() {
    return ctr;
  }

  public void setCtr(String ctr) {
    this.ctr = ctr;
  }


  public String getCtrmess() {
    return ctrmess;
  }

  public void setCtrmess(String ctrmess) {
    this.ctrmess = ctrmess;
  }


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }

}
