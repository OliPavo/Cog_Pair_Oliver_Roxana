package com.Cognizant.studentservice.models;

import java.util.Objects;

public class Student {
    private int studentId;
    private String studentFirstName;
    private String studentLastName;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId &&
                Objects.equals(studentFirstName, student.studentFirstName) &&
                Objects.equals(studentLastName, student.studentLastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, studentFirstName, studentLastName);
    }
}
