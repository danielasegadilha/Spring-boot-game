package com.charigma.model;

import jakarta.persistence.Entity;
import  jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "multipleChoice")
public class MultipleChoice extends Charade {
    private List<String> option;

}