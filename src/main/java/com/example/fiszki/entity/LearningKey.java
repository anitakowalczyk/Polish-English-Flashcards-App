package com.example.fiszki.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.sql.Timestamp;

@Embeddable
class LearningKey implements Serializable {

    private Integer StudentID;
    private Integer CourseID;
    private Integer ProgressCourseID;


    public LearningKey(){}

    public LearningKey(Integer studentID, Integer courseID, Integer progressCourseID, Timestamp date) {
        StudentID = studentID;
        CourseID = courseID;
        ProgressCourseID = progressCourseID;
    }
}