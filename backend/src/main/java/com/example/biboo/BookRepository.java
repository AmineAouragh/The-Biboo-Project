package com.example.biboo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("SELECT b FROM Book b")
    List<Book> findAllBooks();

    @Query("SELECT b FROM Book b WHERE b.bookTitle = :title")
    Book findBookByTitle(String title);

    @Query("SELECT b FROM Book b WHERE b.bookCategory = :bookCategory")
    Book findBookByStatus(String bookCategory);

}
