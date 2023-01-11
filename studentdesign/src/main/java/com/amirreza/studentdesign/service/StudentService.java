package com.amirreza.studentdesign.service;

import com.amirreza.studentdesign.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}