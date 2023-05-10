package com.example.emil.dao;

import com.example.emil.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepos extends JpaRepository<Book, String> {
}
