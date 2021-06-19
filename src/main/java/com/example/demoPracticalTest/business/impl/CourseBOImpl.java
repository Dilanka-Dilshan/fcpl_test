package com.example.demoPracticalTest.business.impl;

import com.example.demoPracticalTest.business.CourseBO;
import com.example.demoPracticalTest.business.util.EntityDTOMapper;
import com.example.demoPracticalTest.dao.CouseDAO;
import com.example.demoPracticalTest.dto.CourseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CourseBOImpl implements CourseBO {

    @Autowired
    private CouseDAO couseDAO;

    @Autowired
    private EntityDTOMapper mapper;

    @Override
    public void saveCourse(CourseDTO courseDTO) throws Exception {
        couseDAO.save(mapper.getCourse(courseDTO));
    }

    @Override
    public void updateCourse(CourseDTO courseDTO) throws Exception {
        couseDAO.save(mapper.getCourse(courseDTO));
    }

    @Override
    public void deleteCourse(Integer courseId) throws Exception {
        couseDAO.deleteById(courseId);
    }

    @Override
    public List<CourseDTO> findAllCourses() throws Exception {
        return couseDAO.findAll().stream().map(course -> mapper.getCourseDto(course)).collect(Collectors.toList());
    }

    @Override
    public CourseDTO findByCourseId(Integer courseId) throws Exception {
        return couseDAO.findById(courseId).map(course -> mapper.getCourseDto(course)).get();
    }
}
