package com.StudentManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.StudentManagementSystem.model.Student;
import com.StudentManagementSystem.service.StudentServiceImpl;

@RestController

@RequestMapping("student")
public class StudentController {
	
	@Autowired
	private StudentServiceImpl studentServiceImpl;
	
	@PostMapping("/create")
	
	public Student createStudent(@RequestBody Student student) {
		return studentServiceImpl.createStudent(student);
	}
	
	@GetMapping("/get")
	public List<Student> getAllStudent(){
		return studentServiceImpl.getAllStudent();
	}
	@GetMapping("get/{id}")
	public Student getStudentById( @PathVariable("id") Long id) {
		return studentServiceImpl.getStudentById(id);
	}
	@DeleteMapping("delete/{id}")
	public void deleteStudent(@PathVariable("id")Long id) {
		studentServiceImpl.deleteStudent(id);
	}
	@PutMapping("put/{id}")
	public Student updateStudent(@RequestBody Student student, @PathVariable("id")Long id ) {
		return studentServiceImpl.updateStudent( student,  id);
	}
}
