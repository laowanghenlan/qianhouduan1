package com.example.wang.dao;

import com.example.wang.model.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<user,Integer> {
//    按照jpa规范提供方法的名字即可实现对数据库的增删改查。
//    如 findByUsername，就是通过 username 字段查询到对应的行，并返回给 User 类。
//    这里我们构建了两个方法，一个是通过用户名查询，一个是通过用户名及密码查询。
    user findByUsername(String username);

    user getByUsernameAndPassword(String username,String password);
}
