package com.example.springbootdemo4.service;

import com.example.springbootdemo4.mapper.UserMapper;
import com.example.springbootdemo4.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User selectById(int userId){
        return userMapper.selectById(userId);

    }

    public List<User> selectAll(){
        return userMapper.selectAll();
    }
    public int insert(User user){
        return userMapper.insert(user);

    }
    public int deleteById(int userId){
        return userMapper.deleteById(userId);
    }

    public int update(User user){
        return userMapper.update(user);
    }

}
