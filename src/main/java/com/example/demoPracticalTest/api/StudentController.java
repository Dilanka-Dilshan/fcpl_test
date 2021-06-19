package com.example.demoPracticalTest.api;

import com.example.demoPracticalTest.business.StudentBO;
import com.example.demoPracticalTest.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/students")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentBO studentBO;

    @PostMapping()
    public ResponseEntity<Object> saveStudent(@RequestBody StudentDTO studentDTO){
        try{
            studentBO.saveStudent(studentDTO);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (Exception e) {
            return new ResponseEntity<>("Data Missing", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
