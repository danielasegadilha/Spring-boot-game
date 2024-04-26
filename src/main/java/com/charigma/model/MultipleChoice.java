package com.charigma.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@DiscriminatorValue("multiple_choice")
public class MultipleChoice extends Charade {
    @OneToMany(mappedBy = "charade", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Option> options;

    @Column(nullable = false)
    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    // Getters and setters
}
