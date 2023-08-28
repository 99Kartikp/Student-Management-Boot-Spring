package com.example.springjpahibernatemysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springjpahibernatemysql.model.Student;
import com.example.springjpahibernatemysql.repository.StudentRepository;

@SpringBootApplication
public class SpringJpaHibernateMysqlApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaHibernateMysqlApplication.class, args);
	}
	
	@Autowired
	StudentRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		// Ye code database ke liye hai
		// Ye hamne database ke liye chalaya tha 
		// abhi mene database me ek baar insert kar diya hai ab waps se 
		// kruga toh duplicacy error aa jaegi 
		
//		Student s = new Student(1,"AAA");
//		
//		repo.save(s);
		
		
		
		
	}

}
