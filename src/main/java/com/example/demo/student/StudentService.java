package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
//Service Layer
 //has to be spring bean
@Service //for service in spring
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents()
    {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        System.out.println(student);

    }
}
