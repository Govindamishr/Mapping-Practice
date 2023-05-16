package com.geekster.govinda.assignmentmapping.service;

import com.geekster.govinda.assignmentmapping.model.Address;
import com.geekster.govinda.assignmentmapping.model.Course;
import com.geekster.govinda.assignmentmapping.repository.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class CourseService {
    @Autowired
    ICourseRepo iCourseRepo;


    public void addCourse(List<Course> course) {
        List<Course> allBook=iCourseRepo.saveAll(course);
    }

    public List<Course> getAllCourse() {
        return iCourseRepo.findAll();
    }

    public Optional<Course> getCourseById(Long courseId) {
        return iCourseRepo.findById(courseId);
    }

    public String updateCourse(Long courseId, Course course)
    {

        Optional<Course> courseUpdate = iCourseRepo.findById(courseId);
        course.setCourseID(courseId);
        if (courseUpdate.isEmpty()) {
            return "Course with course Id: " + courseId + " not found";
        }
        else  {
            iCourseRepo.save(course);
            return "Course with course Id: " + courseId + " deleted successfully";
        }
    }

    public String deleteById(Long courseId) {
        Optional<Course> course = iCourseRepo.findById(courseId);
        if (course.isEmpty()) {
            return "course with course Id: " + courseId + " not found";
        }
        else  {
            iCourseRepo.deleteById(courseId);
            return "course with course Id: " + courseId + " deleted successfully";
        }
    }
}
