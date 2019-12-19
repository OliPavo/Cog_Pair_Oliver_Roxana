package com.Cognizant.studentservice.service;

import com.Cognizant.studentservice.models.Course;
import com.Cognizant.studentservice.models.Student;
import com.Cognizant.studentservice.models.StudentViewModel;
import com.Cognizant.studentservice.util.feign.StudentClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceLayer {
    @Autowired
    private StudentClient client;


    @Autowired
    public ServiceLayer(StudentClient client) {
        this.client = client;
    }

    public StudentViewModel addNewStudent(StudentViewModel student) {
        if (student.getStudentFirstName() == null) {
            throw new IllegalArgumentException("student name is Mandatory");
        }
        return client.addStudent(student);
    }

    public Student getStudentById(Integer id) {
        Student student = client.getStudentById(id).;
        if (student == null) {
            return student;
        }


        private StudentViewModel BuildStudentViewModel (Student student, Course course){
            StudentViewModel studentViewModel = new StudentViewModel();
            studentViewModel.setStudentId(student.getStudentId());
            studentViewModel.setStudentFirstName(student.getStudentFirstName());
            studentViewModel.setStudentLastName(student.getStudentFirstName());

        }


    }
}