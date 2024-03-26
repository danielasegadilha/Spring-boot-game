package com.charigma.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.List;

@Entity(name = "charades")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Charade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String question;
    private String answer;
    private String difficulty;
    private String origin;

}