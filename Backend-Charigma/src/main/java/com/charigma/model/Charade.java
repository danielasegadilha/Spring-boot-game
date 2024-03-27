package com.charigma.model;

import jakarta.persistence.*;

@Entity
@Table(name = "charades")
@Inheritance(strategy = InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name = "charadeId")
public abstract class Charade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "CharadeType", nullable = false)
    protected final String type;
    @Column(nullable = false, length = 150)
    private String description;
    @Column(nullable = false, length = 20)
    private String answer;
    @Column( nullable = false)
    private String difficulty;
    private String origin;
    @Transient
    private String clue;

    public Charade(String type) {
        this.type = type;
    }
    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAnswer() {return answer;}

    public void setAnswer(String answer) {this.answer = answer;}

    public String getDifficulty() {return difficulty;}

    public void setDifficulty(String difficulty) {this.difficulty = difficulty;}

    public String getOrigin() {return origin;}

    public void setOrigin(String origin) {this.origin = origin;}

    public String getClue() {return clue;}

    public void setClue(String clue) {this.clue = clue;}

}