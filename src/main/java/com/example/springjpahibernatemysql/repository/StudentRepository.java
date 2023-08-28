package com.example.springjpahibernatemysql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springjpahibernatemysql.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
//	to write our method
//	public List<Student> findByName(String name);
		 
	
	
	
}
