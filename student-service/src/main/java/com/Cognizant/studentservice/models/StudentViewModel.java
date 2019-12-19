package com.Cognizant.studentservice.models;

import java.util.Objects;

public class StudentViewModel {
    private int studentId;
    private String studentFirstName;
    private String studentLastName;


    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public int getCourse_score() {
        return course_score;
    }

    public void setCourse_score(int course_score) {
        this.course_score = course_score;
    }

    private String course_name;
    private int course_score;

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
        StudentViewModel that = (StudentViewModel) o;
        return studentId == that.studentId &&
                course_score == that.course_score &&
                Objects.equals(studentFirstName, that.studentFirstName) &&
                Objects.equals(studentLastName, that.studentLastName) &&
                Objects.equals(course_name, that.course_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, studentFirstName, studentLastName, course_name, course_score);
    }
}
