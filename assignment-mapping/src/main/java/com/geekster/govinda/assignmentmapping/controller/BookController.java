package com.geekster.govinda.assignmentmapping.controller;

import com.geekster.govinda.assignmentmapping.model.Address;
import com.geekster.govinda.assignmentmapping.model.Book;
import com.geekster.govinda.assignmentmapping.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")

public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/saveBook")
    public String addBook(@RequestBody List<Book> book){
        bookService.addBook(book);
        return "added SuccessFully";
    }
    @GetMapping("/getBook")

    public List<Book> getAllAddress(){
        return bookService.getAllBook();

    }
    @GetMapping("/bookById{bookId}")

    public Optional<Book> getById(@PathVariable Long bookId){
        return bookService.getBookById(bookId);
    }
    @PutMapping("/bookUpdate/{bookId}")

    public String updateAddress(@PathVariable Long bookId,@RequestBody Book book){
        return bookService.updateBook(bookId,book);
    }
}
