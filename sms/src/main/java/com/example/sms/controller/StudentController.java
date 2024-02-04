package com.example.sms.controller;

import com.example.sms.model.Student;
import com.example.sms.repository.StudentRepository;
import com.example.sms.service.StudentService;
import com.example.sms.service.StudentServiceImpl;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/msg")
public class StudentController {
   
    @Autowired
    private StudentService studentService;

  @PostMapping("pstd")
  public Student createStudent( @RequestBody Student student){

      return studentService.createStudent(student);
  }

  @GetMapping("/gstd/{id}")
  public Student getStudentById(@PathVariable("id") Long id){
      return studentService.getStudentById(id);
  }

    @GetMapping("/astd")
    public List<Student> saveAllStudent(){
      return   studentService.saveAllStudent();
    }


    @PutMapping("ustd/{id}")
    public Student updateStudent(@PathVariable("id") Student student){
      return studentService.updateStudent(student);
    }

    @DeleteMapping("/dstd/{id}")
    public  String deleteStudentById(@PathVariable("id") Long id){
     return studentService.deleteStudentById(id);
    }
}
