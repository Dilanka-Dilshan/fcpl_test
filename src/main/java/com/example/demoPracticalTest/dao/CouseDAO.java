package com.example.demoPracticalTest.dao;

import com.example.demoPracticalTest.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouseDAO extends JpaRepository<Course, Integer> {
}
