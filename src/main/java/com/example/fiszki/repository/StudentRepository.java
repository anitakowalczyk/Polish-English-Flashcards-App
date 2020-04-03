package com.example.fiszki.repository;

import com.example.fiszki.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("dresses")
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
