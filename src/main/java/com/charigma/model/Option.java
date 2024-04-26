package com.charigma.model;

import jakarta.persistence.*;

@Entity
@Table(name = "option")
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "charade_id")
    private MultipleChoice charade;

    @Column(name = "option_text", nullable = false, length = 100)
    private String optionText;

    @Column(name = "is_correct", nullable = false)
    private boolean isCorrect;

    public String getOptionText() {
        return optionText;
    }

    public void setOptionText(String optionText) {
        this.optionText = optionText;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    // Getters and setters
}
