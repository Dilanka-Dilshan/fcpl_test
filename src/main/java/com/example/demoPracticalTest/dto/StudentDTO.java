package com.example.demoPracticalTest.dto;

public class StudentDTO {

    private int studentId;

    private String fullName;

    private String nicNo;

    private int telNo;

    private String address;

    private String courses;

    public StudentDTO() {
    }

    public StudentDTO(int studentId, String fullName, String nicNo, int telNo, String address, String courses) {
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

    @Override
    public String toString() {
        return "StudentDTO{" +
                "studentId=" + studentId +
                ", fullName='" + fullName + '\'' +
                ", nicNo='" + nicNo + '\'' +
                ", telNo=" + telNo +
                ", address='" + address + '\'' +
                ", courses='" + courses + '\'' +
                '}';
    }
}
