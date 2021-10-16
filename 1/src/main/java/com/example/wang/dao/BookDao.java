package com.example.wang.dao;

import com.example.wang.model.book;
import org.springframework.data.jpa.repository.JpaRepository;



public interface BookDao extends JpaRepository<book,Integer> {

}
