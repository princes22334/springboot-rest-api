package org.javaguide.springboot.controller;

import org.javaguide.springboot.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    //Http Get Request
    //http://localhost:8080/student
    @GetMapping("/student")
    public Student getStudent(){
        Student student = new Student(1, "Prince", "Singh");
        return student;
    }

    //return List of Students
    //http://localhost:8080/students
    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Prince", "Singh"));
        students.add(new Student(1, "Ankita", "Singh"));
        students.add(new Student(1, "Amit", "Singh"));

        return students;
    }

}
