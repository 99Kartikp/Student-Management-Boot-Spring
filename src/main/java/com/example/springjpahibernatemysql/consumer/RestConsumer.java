package com.example.springjpahibernatemysql.consumer;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import com.example.springjpahibernatemysql.model.Student;

import java.util.List;

public class RestConsumer {

//    public static void consumeAllStudents() {
//        String uri = "http://localhost:8080/students/all";
//        RestTemplate restTemplate = new RestTemplate();
//
//        // Create a ParameterizedTypeReference for List<Student>
//        ParameterizedTypeReference<List<Student>> responseType = new ParameterizedTypeReference<List<Student>>() {};
//
//        ResponseEntity<List<Student>> responseEntity = restTemplate.exchange(uri, HttpMethod.GET, null, responseType);
//
//        List<Student> students = responseEntity.getBody();
//
//        if (students != null && !students.isEmpty()) {
//            System.out.println("Student Details:");
//            for (Student student : students) {
//                System.out.println("Name: " + student.getName());
//                System.out.println("Roll Number: " + student.getRoll());
//                System.out.println();
//            }
//        } else {
//            System.out.println("No students found.");
//        }
//    }
//
//    public static void main(String[] args) {
//        consumeAllStudents();
//    }
}
