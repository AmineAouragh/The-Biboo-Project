package com.example.biboo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "http://localhost:3000")
public class BookController {

    private final BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/my-books")
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    @PostMapping("/add-new-book")
    public Book addBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

}
