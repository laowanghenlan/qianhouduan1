package com.example.wang.controller;

import com.example.wang.model.user;
import com.example.wang.result.Result;
import com.example.wang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;

@CrossOrigin
@RestController
public class usercontroller {
    @Autowired
    private UserService userService;


    @PostMapping(value = "/wang/login")
    @ResponseBody
    public Result login(@RequestBody user requestUser, HttpSession session) {
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);

        user user1 = userService.getAllUser(username, requestUser.getPassword());
        if (null == user1) {
            return new Result(400);
        } else {
            session.setAttribute("user", user1);
            return new Result(200);
        }
    }

}
