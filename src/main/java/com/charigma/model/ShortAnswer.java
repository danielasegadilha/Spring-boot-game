package com.charigma.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("discursive")
public class ShortAnswer extends Charade {

    @Column(nullable = false, length = 30)
    private String answer; // Resposta para charada discursiva

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    // Getters and setters
}
