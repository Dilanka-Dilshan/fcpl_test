package com.example.demoPracticalTest.business;

import com.example.demoPracticalTest.dto.CourseDTO;

import java.util.List;

public interface CourseBO {
    public void saveCourse(CourseDTO courseDTO) throws Exception;
    public void updateCourse(CourseDTO courseDTO) throws Exception;
    public void deleteCourse(Integer courseId) throws Exception;
    public List<CourseDTO> findAllCourses() throws Exception;
    public CourseDTO findByCourseId(Integer courseId) throws Exception;
}
