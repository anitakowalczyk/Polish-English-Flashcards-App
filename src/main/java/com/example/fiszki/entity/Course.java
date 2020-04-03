package com.example.fiszki.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CourseID;
    @ManyToOne(targetEntity = Level.class)
    private Level level;

    private String CourseName;

    public Course() {
    }

    public Course(String courseName, Level level) {
        this.CourseName = courseName;
        this.level = level;
    }
}
