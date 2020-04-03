package com.example.fiszki.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class ProgressOfCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ProgressCourseID;

    private Integer GoodW;
    private Integer BadW;

    public ProgressOfCourse() {
    }

    public ProgressOfCourse(Integer GoodW, Integer BadW) {
        this.GoodW = GoodW;
        this.BadW = BadW;
    }



}
