package com.geekster.govinda.assignmentmapping.service;

import com.geekster.govinda.assignmentmapping.model.Student;
import com.geekster.govinda.assignmentmapping.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class StudentService {

    @Autowired
   IStudentRepo iStudentRepo;



    public String addStudent(List<Student> student) {
        List<Student> allList=iStudentRepo.saveAll(student);
        return "Hello Govinda Kumar mishra";

    }

    public List<Student> getAll() {
        return iStudentRepo.findAll();
    }

    public Optional<Student> getById(Long studentID) {
        return iStudentRepo.findById(studentID);
    }

    public String updateStudent(Long studentId, Student student) {
        Optional<Student> studentList = iStudentRepo.findById(studentId);
        student.setStudentID(studentId);
        if (studentList.isEmpty()) {
            return "Student with address Id: " + studentId + " not found";
        }
        else  {
            iStudentRepo.save(student);
            return "student with address Id: " + studentId + " updated successfully";
        }

    }

    public String deleteById(Long studentId) {
        Optional<Student> student = iStudentRepo.findById(studentId);
        if (student.isEmpty()) {
            return "student with address Id: " + studentId + " not found";
        }
        else  {
            iStudentRepo.deleteById(studentId);
            return "student with address Id: " + studentId + " deleted successfully";
        }
    }
}
