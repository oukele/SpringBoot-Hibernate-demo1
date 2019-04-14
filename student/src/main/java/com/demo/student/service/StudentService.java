package com.demo.student.service;

import com.demo.student.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> listAll();

    int save(Student student);

    int delete(int stuId);

    int update(Student student);

}
