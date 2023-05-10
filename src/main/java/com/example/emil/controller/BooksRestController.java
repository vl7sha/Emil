package com.example.emil.controller;

import com.example.emil.dao.BookRepos;
import com.example.emil.dto.BookDTO;
import com.example.emil.entity.Book;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/books")
public class BooksRestController {

    private final BookRepos bookRepos;
    private ModelMapper modelMapper;

    @Autowired
    public BooksRestController(BookRepos bookRepos, ModelMapper modelMapper){
        this.bookRepos = bookRepos;
        this.modelMapper = modelMapper;
    }

    @GetMapping
    public List<Book> getAll(){
        return bookRepos.findAll();
    }

    @GetMapping("/info")
    public List<BookDTO> getAllParam(){
        return bookRepos.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @PostMapping
    public Book create(@RequestBody Book book){
        return bookRepos.save(book);
    }


    private BookDTO convertToDTO(Book book){
        return modelMapper.map(book, BookDTO.class);
    }
}
