package com.anand.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.anand.entity.Student;

public interface StudentService {

    Student save(Student student);

    Student findById(Long id);

    void deleteById(Long id);

    Page<Student> findAll(Pageable pageable);
}



