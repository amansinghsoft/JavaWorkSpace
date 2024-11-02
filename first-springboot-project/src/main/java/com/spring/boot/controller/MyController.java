package com.spring.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.model.Student;

@RestController
@RequestMapping("/api")
public class MyController {

	@GetMapping("/message")
	public String myMethod() {
		return "Hii! this is my first program.";
	}
	
	@GetMapping("/student")
	public Student getStudent() {
		Student student = new Student();
		student.setRollNo(101);
		student.setName("Mohan");
		student.setMarks(92);
		student.setAge(21);
		return student;
	}
	
}
