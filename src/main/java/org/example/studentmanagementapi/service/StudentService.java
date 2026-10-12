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

    public Student getStudentById(int id){
        for(Student s: stds){
            if(s.getId() == id){
                return s;
            }
        }
        return null;
    }

    public boolean deleteStudent(int id){
        return stds.removeIf(s -> s.getId() == id);
    }
    public Student updateStudent(int id, Student updatedStudent) {
        for (int i = 0; i < stds.size(); i++) {
            if (stds.get(i).getId() == id) {
                updatedStudent.setId(id);
                stds.set(i, updatedStudent);
                return updatedStudent;

            }
        }
        return null; // wenn Student nicht vorhanden ist
    }
}
