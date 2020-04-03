package com.example.fiszki.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Level {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer LevelID;

    private String Name;

    public Level() {
    }

    public Level(String name) {
        this.Name = name;
    }
}
