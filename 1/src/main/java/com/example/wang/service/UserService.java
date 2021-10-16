package com.example.wang.service;

import com.example.wang.dao.UserDao;
import com.example.wang.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public user getByUserName(String username) {
        return userDao.findByUsername(username);
    }

    public user getAllUser(String username, String password){
        return userDao.getByUsernameAndPassword(username, password);
    }

}
