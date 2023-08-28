package com.example.springjpahibernatemysql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springjpahibernatemysql.model.Student;
import com.example.springjpahibernatemysql.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
        
    }

    public Optional<Student> getStudentById(Integer id) {
        return studentRepository.findById(id);
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Integer id, Student updatedStudent) {
        if (studentRepository.existsById(id)) {
            updatedStudent.setRoll(id);
            return studentRepository.save(updatedStudent);
        }
        return null; // Handle the case where the student doesn't exist
    }

    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }
    
}
