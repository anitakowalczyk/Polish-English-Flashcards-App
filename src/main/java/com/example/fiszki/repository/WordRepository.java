package com.example.fiszki.repository;

import com.example.fiszki.entity.Word;
import org.springframework.data.repository.CrudRepository;


public interface WordRepository extends CrudRepository<Word, Integer> {

}
