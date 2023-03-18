package com.students.springboot.service;

import com.students.springboot.model.Student;

import java.util.List;


public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public List<Student> getReport();
}
