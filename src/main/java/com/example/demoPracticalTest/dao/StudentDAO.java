package com.example.demoPracticalTest.dao;

import com.example.demoPracticalTest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDAO extends JpaRepository<Student,Integer> {
}
