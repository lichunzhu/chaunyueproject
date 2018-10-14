package com.chunyue.project.model;

public class Remarks {
    private Long id;

    private String dtr;

    private String dtrmess;

    private String ctr;

    private String ctrmess;

    private Integer state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDtr() {
        return dtr;
    }

    public void setDtr(String dtr) {
        this.dtr = dtr == null ? null : dtr.trim();
    }

    public String getDtrmess() {
        return dtrmess;
    }

    public void setDtrmess(String dtrmess) {
        this.dtrmess = dtrmess == null ? null : dtrmess.trim();
    }

    public String getCtr() {
        return ctr;
    }

    public void setCtr(String ctr) {
        this.ctr = ctr == null ? null : ctr.trim();
    }

    public String getCtrmess() {
        return ctrmess;
    }

    public void setCtrmess(String ctrmess) {
        this.ctrmess = ctrmess == null ? null : ctrmess.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}