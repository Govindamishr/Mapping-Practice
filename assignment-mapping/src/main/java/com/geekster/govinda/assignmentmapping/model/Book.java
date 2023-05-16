package com.geekster.govinda.assignmentmapping.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookID;

    private String bookTitle;
    private String bookAuthor;
    private String bookDescription;
    private String bookPrice;
    @ManyToOne(cascade = CascadeType.ALL)
    private Student student;


}
