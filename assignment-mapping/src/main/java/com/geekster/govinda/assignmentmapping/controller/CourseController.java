package com.geekster.govinda.assignmentmapping.controller;

import com.geekster.govinda.assignmentmapping.model.Address;
import com.geekster.govinda.assignmentmapping.model.Course;
import com.geekster.govinda.assignmentmapping.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/course")

public class CourseController {
    @Autowired
    CourseService courseService;
    @PostMapping("/saveCourse")
    public String addCourse(@RequestBody List<Course> course){
        courseService.addCourse(course);
        return "added successFully";
    }
    @GetMapping("/getCourse")

    public List<Course> getAllAddress(){
        return courseService.getAllCourse();

    }
    @GetMapping("/courseById{courseId}")

    public Optional<Course> getById(@PathVariable Long courseId){
        return courseService.getCourseById(courseId);
    }
    @PutMapping("/courseUpdate/{courseId}")

    public String updateCourse(@PathVariable Long courseId,@RequestBody Course course){
        return courseService.updateCourse(courseId,course);
    }
    @DeleteMapping("/deleteBy/{courseId}")

    public String deleteById(@PathVariable Long courseId){

        return courseService.deleteById(courseId);

    }

}
