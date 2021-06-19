package com.example.demoPracticalTest.dto;

import java.io.Serializable;

public class CourseDTO implements Serializable {

    private int courseId;

    private String courseName;

    private String division;

    public CourseDTO() {
    }

    public CourseDTO(int courseId, String courseName, String division) {
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
        return "CourseDTO{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", division='" + division + '\'' +
                '}';
    }
}
