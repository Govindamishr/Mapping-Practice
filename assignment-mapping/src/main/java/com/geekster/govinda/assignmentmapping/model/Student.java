package com.geekster.govinda.assignmentmapping.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity


public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long studentID;
    private String studentName;
    private String studentAge;
    private String StudentPhoneNumber;
    private String studentBranch;
    @OneToOne(cascade = CascadeType.ALL)

    private Address address;





}
