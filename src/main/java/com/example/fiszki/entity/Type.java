package com.example.fiszki.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer TypeID;

    private String Name;

    public Type() {
    }

    public Type(String name) {
        this.Name = name;
    }
}
