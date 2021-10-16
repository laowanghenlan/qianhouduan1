package com.example.wang.controller;

import com.example.wang.model.book;
import com.example.wang.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin
@RestController
public class bookcontroller {
    @Autowired
    private BookService bookService;

    @GetMapping("/wang/books")
    public List<book> list() throws Exception {
        return bookService.list();
    }
}
