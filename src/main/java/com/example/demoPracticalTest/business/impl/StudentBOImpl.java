package com.example.demoPracticalTest.business.impl;

import com.example.demoPracticalTest.business.StudentBO;
import com.example.demoPracticalTest.business.util.EntityDTOMapper;
import com.example.demoPracticalTest.dao.StudentDAO;
import com.example.demoPracticalTest.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class StudentBOImpl implements StudentBO {

    @Autowired
    private StudentDAO studentDAO;

    @Autowired
    private EntityDTOMapper mapper;

    @Override
    public void saveStudent(StudentDTO studentDTO) throws Exception {
        studentDAO.save(mapper.getStudent(studentDTO));
    }
}
