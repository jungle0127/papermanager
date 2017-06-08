package com.ncee.dao.model;

public class Question {
    private Long questionId;

    private String question;

    private Long questionTypeId;

    private Long constructTypeId;

    private Integer active;

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public Long getQuestionTypeId() {
        return questionTypeId;
    }

    public void setQuestionTypeId(Long questionTypeId) {
        this.questionTypeId = questionTypeId;
    }

    public Long getConstructTypeId() {
        return constructTypeId;
    }

    public void setConstructTypeId(Long constructTypeId) {
        this.constructTypeId = constructTypeId;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }
}