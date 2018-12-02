package com.example.springbootdemo4.mapper;

import com.example.springbootdemo4.model.User;

import java.util.List;

public interface UserMapper {

    User selectById(int userId);

    List<User> selectAll();

    int insert(User user);

    int update(User user);

    int deleteById(int userId);


}