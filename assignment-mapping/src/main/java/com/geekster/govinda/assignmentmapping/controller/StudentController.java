package com.geekster.govinda.assignmentmapping.controller;

import com.geekster.govinda.assignmentmapping.model.Student;
import com.geekster.govinda.assignmentmapping.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")

public class StudentController {
    @Autowired
    StudentService studentService;

    //post student

    @PostMapping("/addStudent")

    public String saveStudent(@RequestBody List<Student> student){

        studentService.addStudent(student);
        return "save SuccessFull";
    }

    // Get All
    @GetMapping("/allGet")
    public List<Student> getAll(){
        return studentService.getAll();

    }

    // Get By id

    @GetMapping("getBy/{studentID}")
    public Optional<Student> getById(@PathVariable Long studentID){

        return studentService.getById(studentID);
    }
    //update

    @PutMapping("/update/{studentId}")
    public String updateStudent(@PathVariable Long studentId ,@RequestBody Student student){
       return  studentService.updateStudent(studentId,student);
    }
    @DeleteMapping("/delete{studentId}")
    public String deleteById(@PathVariable Long studentId){

        return studentService.deleteById(studentId);
    }

}
