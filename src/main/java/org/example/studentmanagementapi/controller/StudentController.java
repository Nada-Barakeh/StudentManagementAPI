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

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id){
        return studentService.getStudentById(id);
    }
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        boolean delete = studentService.deleteStudent(id);
        if(delete){
            return "Student with ID " + id + " deleted successfully";
        } else {
            return "Student with ID " + id + " not found";
            }
        }

     @PutMapping("/{id}")
      public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
        return studentService.updateStudent(id, student);
        }
    }
