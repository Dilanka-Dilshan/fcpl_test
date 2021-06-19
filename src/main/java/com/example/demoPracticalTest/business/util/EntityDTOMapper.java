package com.example.demoPracticalTest.business.util;

import com.example.demoPracticalTest.dto.CourseDTO;
import com.example.demoPracticalTest.dto.StudentDTO;
import com.example.demoPracticalTest.entity.Course;
import com.example.demoPracticalTest.entity.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface EntityDTOMapper {

    Student getStudent(StudentDTO studentDTO);

    Course getCourse(CourseDTO courseDTO);
    CourseDTO getCourseDto(Course course);
}
