package com.example.demoPracticalTest.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="student")
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int studentId;

    @Column(name = "full_name")
    @NotNull(message = "Full name required")
    private String fullName;

    @Column(name = "nic_no")
    @NotNull(message = "NIC no required")
    private String nicNo;

    @Column(name="tel_no")
    @NotNull(message = "Mobile no required")
    private int telNo;

    @Column(name = "address")
    @NotNull(message = "Address required")
    private String address;

    @Column(name="courses")
    private String courses;

    public Student() {
    }

    public Student(int studentId, String fullName, String nicNo, int telNo, String address, String courses) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.nicNo = nicNo;
        this.telNo = telNo;
        this.address = address;
        this.courses = courses;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNicNo() {
        return nicNo;
    }

    public void setNicNo(String nicNo) {
        this.nicNo = nicNo;
    }

    public int getTelNo() {
        return telNo;
    }

    public void setTelNo(int telNo) {
        this.telNo = telNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }
//
//    @ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.PERSIST, CascadeType.MERGE})
//    @JoinTable(name="couse_student", joinColumns={
//            @JoinColumn(name = "student_course_id", referencedColumnName = "student_id", updatable = false, nullable = false)},
//            inverseJoinColumns = {@JoinColumn(name="couse_id", referencedColumnName = "course_id", updatable = false, nullable = false)})
//
//    private Set<Course> studentList = new HashSet<>();

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", fullName='" + fullName + '\'' +
                ", nicNo='" + nicNo + '\'' +
                ", telNo=" + telNo +
                ", address='" + address + '\'' +
                ", courses='" + courses + '\'' +
                '}';
    }
}
