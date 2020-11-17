package com.project.student.studentDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.student.entity.StudentEntity;

public interface StudentDao extends JpaRepository<StudentEntity, Long> {

}
