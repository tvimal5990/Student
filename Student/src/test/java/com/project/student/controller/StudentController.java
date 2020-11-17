package com.project.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.student.entity.StudentEntity;
import com.project.student.service.StudentService;

@RestController
public class StudentController {
	
	@GetMapping("/test")
	public String test() {
		return "Hi There!!";
	}
	
	@Autowired
	public StudentService students;
	
	@GetMapping("/students")
	public List<StudentEntity> getStudents(){
		return students.getStudents();
	}
	
	@GetMapping("/student/{studentId}")
	public Optional<StudentEntity> getStudent(@PathVariable long studentId) {
		return students.getStudent(studentId);
	}
	
	@PostMapping("/student")
	public StudentEntity addStudent(@RequestBody StudentEntity student) {
		return students.addStudent(student);
	}
	
	@DeleteMapping("/student/{studentId}")
	public Optional<StudentEntity> removeStudent(@PathVariable long studentId) {
		Optional<StudentEntity> temp = students.getStudent(studentId);
		students.removeStudent(studentId);
		return temp;
	}
	
	@PutMapping("/student")
	public StudentEntity updateStudent(@RequestBody StudentEntity student) {
		return students.updateStudent(student);
	}
	

}