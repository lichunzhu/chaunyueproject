package com.chunyue.project.model;

public class Question {
    private Long qid;

    private String question;

    public Long getQid() {
        return qid;
    }

    public void setQid(Long qid) {
        this.qid = qid;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }
}