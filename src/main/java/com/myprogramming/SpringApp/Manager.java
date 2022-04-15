package com.myprogramming.SpringApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Manager {

    @Autowired
    private Records records;

    @PostMapping("saveBook")
    public Book addBook(@RequestBody Book book){
        return records.save(book);
    }
    @GetMapping("getBooks")
    public List<Book> getBooks(){
        return records.findAll();
    }
    @GetMapping("getByType/{id}")
    public Optional<Book> getBook(@PathVariable String id){
        return records.findByGenre(id);
    }
    @PostMapping("editBook/{BookId}")
    public Book editBook(@RequestBody Book book){
        return records.save(book);
    }
    @GetMapping("deleteBook/{bookId}")
    public String deleteBook(@PathVariable int bookId){
        records.deleteById(bookId);
        return "Deleted";
    }
}
