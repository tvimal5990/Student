package com.project.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.student.entity.StudentEntity;
import com.project.student.studentDao.StudentDao;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDao sd;

	@Override
	public List<StudentEntity> getStudents() {
		return sd.findAll();
	}
	
	@Override
	public Optional<StudentEntity> getStudent(long studentId) {
		return sd.findById(studentId);
	}
	
	@Override
	public StudentEntity addStudent(StudentEntity student) {
		return sd.save(student);
	}
	
	@Override
	public void removeStudent(long studentId) {
		sd.deleteById(studentId);
	}
	
	@Override
	public StudentEntity updateStudent(StudentEntity student) {
		return sd.save(student);
	}

}