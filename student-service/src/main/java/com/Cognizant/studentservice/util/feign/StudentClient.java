package com.Cognizant.studentservice.util.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "student-repository")
public interface StudentClient {

    @Autowired
    @GetMapping("/student/{id}")
    public StudentClient getStudentById(@PathVariable int id);
    @PostMapping("/student")
    public StudentClient addStudent(@RequestBody StudentClient studentClient);
    @GetMapping("/student")
    public List<StudentClient> getAllStudents();
    @PutMapping("/student/{id}")
    public void updateStudent(@PathVariable int id, @RequestBody StudentClient studentClient);
    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable int id);
}
