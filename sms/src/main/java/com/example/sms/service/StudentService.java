package com.example.sms.service;

import com.example.sms.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {



    public Student getStudentById(Long id);

    public Student createStudent(Student student);

    public List<Student>  saveAllStudent();
    public Student updateStudent(Student student);

    public String deleteStudentById(Long id);

}
