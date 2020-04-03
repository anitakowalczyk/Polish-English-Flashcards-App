package com.example.fiszki.service;

import com.example.fiszki.entity.Student;

import java.util.List;

public interface StudentService {

    Iterable<Student> findAll();

    Student save(Student student);

    void saveStudents(List<Student> students);

}
