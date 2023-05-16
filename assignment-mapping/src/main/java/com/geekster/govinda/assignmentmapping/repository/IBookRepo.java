package com.geekster.govinda.assignmentmapping.repository;

import com.geekster.govinda.assignmentmapping.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IBookRepo extends JpaRepository<Book,Long> {

}
