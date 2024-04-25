package com.charigma.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("discursive")
public class ShortAnswer extends Charade {
    private String answer; // Resposta para charada discursiva

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    // Getters and setters
}
