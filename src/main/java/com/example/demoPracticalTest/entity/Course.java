package com.example.demoPracticalTest.entity;

import com.sun.javafx.beans.IDProperty;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="course")
public class Course implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private int courseId;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "division")
    private String division;

    public Course() {
    }

    public Course(int courseId, String courseName, String division) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.division = division;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", division='" + division + '\'' +
                '}';
    }
}
