package com.example.biboo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findAllBooks();

    Book findBookByTitle(String bookTitle);

    Book findBookByStatus(String bookStatus);

}
