package com.charigma.model;

import jakarta.persistence.Transient;

@Transient
public class UserAnswer {

    private String answer;

    public String getUserAnswer() {
        return answer;
    }

    public void setUserAnswer(String answer) {
        this.answer = answer;
    }
}
