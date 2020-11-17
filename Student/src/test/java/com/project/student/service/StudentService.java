package com.project.student.service;

import java.util.List;
import java.util.Optional;

import com.project.student.entity.StudentEntity;

public interface StudentService {
	
	public List<StudentEntity> getStudents();
	public Optional<StudentEntity> getStudent(long studentId);
	public StudentEntity addStudent(StudentEntity student);
	public void removeStudent(long studentId);
	public StudentEntity updateStudent(StudentEntity student);
}