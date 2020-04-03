package com.example.fiszki.controller;

import com.example.fiszki.entity.Student;
import com.example.fiszki.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/fiszki")
public class MainController {

    private StudentService studentService;

    @Autowired
    public MainController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public Iterable<Student> getAllStudents() {
        return studentService.findAll();
    }



}