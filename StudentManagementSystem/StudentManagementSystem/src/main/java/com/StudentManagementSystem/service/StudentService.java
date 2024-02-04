package com.StudentManagementSystem.service;

import java.util.List;

import com.StudentManagementSystem.model.Student;

public interface StudentService {
	
	
	// for student creation
	public Student createStudent(Student student);
	
	// for List Of student
	
	public List<Student> getAllStudent();
	
	// get Student by id
	
	public Student getStudentById(Long id);
	
	// for student deletion
	
	public void deleteStudent(Long id);
	
	// for student update
	public Student updateStudent(Student student,Long id );
}
