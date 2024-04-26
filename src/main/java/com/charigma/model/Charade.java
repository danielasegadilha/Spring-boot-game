package com.charigma.model;

import com.charigma.enums.Difficulty;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "charade")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
public abstract class Charade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "charade_id")
    private Long id;

    @Column(nullable = false, length = 200, unique = true)
    private String question;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Difficulty difficulty;

    private String origin;

    @ManyToMany
    @JoinTable(
            name = "charade_tag",
            joinColumns = @JoinColumn(name = "charade_id"),
            inverseJoinColumns = @JoinColumn(name = "tags")
    )
    private List<Tag> tags;

    public void setDifficulty(Difficulty difficulty) { this.difficulty = difficulty; }

    public Difficulty getDifficulty() { return difficulty;}

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

}
