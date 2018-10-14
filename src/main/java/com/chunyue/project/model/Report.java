package com.chunyue.project.model;

public class Report {
    private Long id;

    private String uid;

    private String mass;

    private String uid2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass == null ? null : mass.trim();
    }

    public String getUid2() {
        return uid2;
    }

    public void setUid2(String uid2) {
        this.uid2 = uid2 == null ? null : uid2.trim();
    }
}