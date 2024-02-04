package com.StudentManagementSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentManagementSystem.model.Student;
import com.StudentManagementSystem.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student createStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Long id) {
		Optional<Student>data = studentRepository.findById(id);
		
		return data.get() ;
	}

	@Override
	public void deleteStudent(Long id) {
		
		 studentRepository.deleteById(id);
	}

	@Override
	public Student updateStudent(Student student, Long id) {
	Student student2 = studentRepository.findById(id).get();
	student2.setName(student.getName());
	student2.setAddress(student.getAddress());
	student2.setAbout(student.getAbout());
	Student save1 = studentRepository.save(student2);
		return save1;
	}
	
	
}
