package com.myprogramming.SpringApp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Records extends JpaRepository<Book,Integer> {
    public Optional<Book> findByGenre(String id);
}
