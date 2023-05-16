package com.geekster.govinda.assignmentmapping.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Laptop {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long ID;
    private String name;
    private String brand;
    private Integer price;
    @OneToOne(cascade = CascadeType.ALL)
    private Student student;


}
