package com.charigma.model;

import jakarta.persistence.*;


@Entity
@Table(name = "charades")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Charade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 150)
    private String question;
    @Column(nullable = false, length = 20)
    private String answer;
    @Column(nullable = false)
    private String difficulty;
    private String origin;


    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getQuestion() {return question;}

    public void setQuestion(String question) {this.question = question;}

    public String getAnswer() {return answer;}

    public void setAnswer(String answer) {this.answer = answer;}

    public String getDifficulty() {return difficulty;}

    public void setDifficulty(String difficulty) {this.difficulty = difficulty;}

    public String getOrigin() {return origin;}

    public void setOrigin(String origin) {this.origin = origin;}
}