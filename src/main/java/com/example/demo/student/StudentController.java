package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Api layer
@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {

    private final StudentService studentService;
    @Autowired //dependency injection
    public StudentController(StudentService studentService, StudentService studentService1) {
        this.studentService = studentService;

    }

    @GetMapping//Get request call
    public List<Student> getStudents()
    {
        return studentService.getStudents();
    }
    @PostMapping //When we want to add new resources
    public void registerNewStudent(@RequestBody Student student)
     {
         studentService.addNewStudent(student);
     }
     @DeleteMapping(path="{studentId}")
     public void deleteStudent(@PathVariable("studentId") Long studentId)
     {
        studentService.deleteStudent(studentId);
     }
     @PutMapping(path="{studentId}")
    public void updateStudent
             (
        @PathVariable("studentId") Long studentId,
        @RequestParam(required = false) String name,
        @RequestParam(required = false) String email
    )
    {
        studentService.updateStudent(studentId, name, email);
    }



}
