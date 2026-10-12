package org.example.studentmanagementapi.service;
import org.example.studentmanagementapi.model.Student;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

@Component
public class StudentService {

    private List<Student> stds = new ArrayList<>();

    public StudentService(){
        stds.add(new Student(1, "Max Mustermann","Mathe"));
        stds.add(new Student(2, "Erika Musterfrau" , "Physik"));
        stds.add(new Student(3, "Selena Musterfrau2", "Informatik"));

    }
    public List<Student> getAllStudents(){
        return Collections.unmodifiableList(stds); // defensive Copy
    }
    public Student addStudent(Student student){
        stds.add(student);
        return student;
    }
}
