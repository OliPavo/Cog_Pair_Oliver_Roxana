package com.Cognizant.studentservice.models;


import java.util.Objects;

public class Course {

    private int id;
    private int studentId;
    private String courseName;
    private int  score;

    public Course(int id, int studentId, String courseName, int score) {
        this.id =id;
        this.studentId = studentId;
        this.courseName = courseName;
        this.score = score;
    }

    public Course(int studentId, String courseName, int score) {
        this.studentId = studentId;
        this.courseName = courseName;
        this.score = score;
    }

    public Course() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id == course.id &&
                studentId == course.studentId &&
                score == course.score &&
                Objects.equals(courseName, course.courseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, studentId, courseName, score);
    }
}
