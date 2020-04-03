package com.example.fiszki.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
public class Learning {

    @EmbeddedId
    LearningKey id;

    @ManyToOne
    @MapsId
    @JoinColumn
    Student student;

    @ManyToOne
    @MapsId
    @JoinColumn
    Course course;

    @ManyToOne
    @MapsId
    @JoinColumn
    ProgressOfCourse progressOfCourse;

    private Timestamp date;

    public Learning(){}

    public Learning(Student student, Course course, ProgressOfCourse progressOfCourse, Timestamp date) {
        this.student = student;
        this.course = course;
        this.progressOfCourse = progressOfCourse;
        this.date = date;
    }
}