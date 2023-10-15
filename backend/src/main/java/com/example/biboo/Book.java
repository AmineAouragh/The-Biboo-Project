package com.example.biboo;


import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue
    private Long bookId;

    private String bookTitle;

    private String bookAuthor;

    private int bookLength; // number of pages

    private int bookReleaseYear;

    private String bookCategory; // "finished reading", "current reading", "to read next"

    private String bookGenre; // "thriller", "romance", "horror", "crime", "fantasy"...

    protected Book() {

    }

    public Book(String book_title, String book_author, int book_length, int book_release_year, String book_category, String book_genre) {
        this.bookTitle= book_title;
        this.bookAuthor = book_author;
        this.bookLength = book_length;
        this.bookReleaseYear = book_release_year;
        this.bookCategory = book_category;
        this.bookGenre = book_genre;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getBookLength() {
        return bookLength;
    }

    public int getBookReleaseYear() {
        return bookReleaseYear;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookLength(int bookLength) {
        this.bookLength = bookLength;
    }

    public void setBookReleaseYear(int bookReleaseYear) {
        this.bookReleaseYear = bookReleaseYear;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }
}
