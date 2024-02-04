package com.example.sms.service;

import com.example.sms.model.Student;
import com.example.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;


    @Override
    public Student getStudentById(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        return student.get();
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> saveAllStudent(){
        List<Student> all = studentRepository.findAll();
        return all;
    }

    @Override
    public Student updateStudent(Student student) {
        Student student1 = studentRepository.findById(student.getId()).get();
        student1.setId(student.getId());
        student1.setName(student.getName());
        student1.setAddress(student.getAddress());
        student1.setCourse(student.getCourse());
        student1.setFee(student.getFee());
        Student save = studentRepository.save(student1);
        return save;
    }

    @Override
    public String deleteStudentById(Long id) {
        if(studentRepository.findById(id).isPresent()){
            studentRepository.deleteById(id);
            return "student is delete succefully !!!";
        }
        return "Student is not available in the database";
    }
}
