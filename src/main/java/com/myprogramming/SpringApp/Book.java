package com.myprogramming.SpringApp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    private int bookId;
    private int quantity;
    private String bookName;
    private String genre;

    public Book(int bookId, int quantity, String bookName, String genre) {
        this.bookId = bookId;
        this.quantity = quantity;
        this.bookName = bookName;
        this.genre = genre;
    }

    public Book() {
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
