package com.example.fiszki.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer WordID;

    @ManyToOne(targetEntity = Course.class)
    private Course course;

    @ManyToOne(targetEntity = Type.class)
    private Type type;

    private String MeaningPL;
    private String MeaningENG;

    public Word() {
    }

    public Word(Course course, Type type, String meaningPL, String meaningENG) {
        this.course = course;
        this.type = type;
        this.MeaningPL = meaningPL;
        this.MeaningENG = meaningENG;
    }



}
