package com.example.fiszki.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class WordProgress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer WordID;

    @ManyToOne(targetEntity = ProgressOfCourse.class)
    private ProgressOfCourse ProgressCourseID;

    private String Good;
    private String Bad;

    public WordProgress() {
    }

    public WordProgress(ProgressOfCourse progressCourseID, String good, String bad) {
        this.ProgressCourseID = progressCourseID;
        this.Good = good;
        this.Bad = bad;
    }

}
