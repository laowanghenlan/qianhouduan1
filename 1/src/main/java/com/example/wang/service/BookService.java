package com.example.wang.service;

import com.example.wang.dao.BookDao;
import com.example.wang.model.book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
   @Autowired
    private BookDao bookDao;

    public List<book> list() {
//        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return bookDao.findAll();
    }
}
