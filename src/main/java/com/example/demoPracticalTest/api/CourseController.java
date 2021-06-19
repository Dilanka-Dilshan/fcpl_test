package com.example.demoPracticalTest.api;

import com.example.demoPracticalTest.business.CourseBO;
import com.example.demoPracticalTest.dto.CourseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @Autowired
    private CourseBO courseBO;

    @PostMapping()
    public ResponseEntity<Object> saveCourses(@RequestBody CourseDTO courseDTO){
        try{
            courseBO.saveCourse(courseDTO);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch(Exception e){
            return new ResponseEntity<>("Internal Server error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping()
    public ResponseEntity<List<CourseDTO>> getAllCourses(){
        try{
            return new ResponseEntity<List<CourseDTO>>(courseBO.findAllCourses(),HttpStatus.OK);
        }catch(NoSuchElementException ex){
            return new ResponseEntity("Not valid courses",HttpStatus.NOT_FOUND);
        }catch (Exception e){
            return new ResponseEntity("Internal Server error", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/{courseId}")
    public ResponseEntity<Object> getStudent(@PathVariable int courseId) throws Exception{
        try{
            return new ResponseEntity<>(courseBO.findByCourseId(courseId),HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Invalid course ID",HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(value = "/{courseId}")
    public ResponseEntity<Object> deleteStudent(@PathVariable int courseId) throws Exception{
        try{
            courseBO.findByCourseId(courseId);
            courseBO.deleteCourse(courseId);
            return new ResponseEntity<>("Successfull Removed Student",HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>("Invalid course Id",HttpStatus.NOT_FOUND);
        }catch (Exception e){
            return new ResponseEntity<>("Internal server error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping(value = "/{courseId}")
    public ResponseEntity<Object> updateStudent(@Valid @RequestBody CourseDTO courseDTO, @PathVariable int courseId) throws Exception{
        if(courseDTO.getCourseId() != Integer.valueOf(courseId)){
            return new ResponseEntity<>("Mismatch Id",HttpStatus.BAD_REQUEST);
        }

        try{
            courseBO.findByCourseId(courseId);
            courseBO.updateCourse(courseDTO);
            return new ResponseEntity<>("Successfully Updated",HttpStatus.CREATED);
        }catch (NoSuchElementException e){
            return new ResponseEntity<>("Invalid course",HttpStatus.NOT_FOUND);
        }catch (Exception e){
            return new ResponseEntity<>("Internal Server Error",HttpStatus.INTERNAL_SERVER_ERROR);
        }
}
