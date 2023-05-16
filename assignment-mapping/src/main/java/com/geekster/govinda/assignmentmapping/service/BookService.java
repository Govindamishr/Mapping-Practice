package com.geekster.govinda.assignmentmapping.service;

import com.geekster.govinda.assignmentmapping.model.Address;
import com.geekster.govinda.assignmentmapping.model.Book;
import com.geekster.govinda.assignmentmapping.model.Student;
import com.geekster.govinda.assignmentmapping.repository.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class BookService {
    @Autowired
    IBookRepo bookRepo;

    public void addBook(List<Book> book) {
        List<Book> allBook= bookRepo.saveAll(book);

    }

    public List<Book> getAllBook() {
        return bookRepo.findAll();
    }

    public Optional<Book> getBookById(Long bookId) {
        return bookRepo.findById(bookId);
    }

    public String updateBook(Long bookId, Book book) {
        Optional<Book> bookList =bookRepo.findById(bookId);
        book.setBookID(bookId);
        if (bookList.isEmpty()) {
            return "Book with Book Id: " + bookId + " not found";
        }
        else  {
            bookRepo.save(book);
            return "Book with Book Id: " + bookId + " updated successfully";
        }
    }
}
