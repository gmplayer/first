package com.study.first.dao;

import com.study.first.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student,Integer>{
}
