package com.geekster.govinda.assignmentmapping.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseID;
    private String courseTitle;
    private String courseDescription;
    private double courseDuration;

    @ManyToMany(cascade = CascadeType.ALL)
   private List<Student> studentList;




}
