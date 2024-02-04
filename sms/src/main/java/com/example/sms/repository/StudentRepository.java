package com.example.sms.repository;

import com.example.sms.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.logging.Logger;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
