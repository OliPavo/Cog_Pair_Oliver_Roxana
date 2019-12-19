package com.Cognizant.studentservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SchoolController {
    @Autowired
    private StudentRepository repo;
    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable int id){
        Optional<Student> student = repo.findById(id);
        if(student.isPresent()){
            return student.get();
        }
        throw new NotFoundException(id);
    }
    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student ){
        return repo.save(student);
    }
    @GetMapping("/student")
    public List<Student> getAllStudents(){
        return repo.findAll();
    }
    @PutMapping("/student/{id}")
    public void updateStudent(@PathVariable int id, @RequestBody Student student){
        repo.findById(student.getStudentId()).orElseThrow(() -> new IllegalArgumentException("Student doesn't exist"));
        repo.save(student);
    }
    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable int id){
        repo.deleteById(id);
    }
}
