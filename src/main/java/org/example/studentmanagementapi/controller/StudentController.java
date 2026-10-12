package org.example.studentmanagementapi.controller;


import org.example.studentmanagementapi.model.Student;
import org.example.studentmanagementapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @PostMapping
    public Student addStudent(@RequestBody Student student){
         return studentService.addStudent(student);
    }
}
