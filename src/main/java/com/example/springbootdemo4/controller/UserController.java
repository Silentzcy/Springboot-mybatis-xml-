package com.example.springbootdemo4.controller;

import com.example.springbootdemo4.model.User;
import com.example.springbootdemo4.service.UserService;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/selectAll",method = RequestMethod.GET)
    @ResponseBody
    public List<User> selectAll(){
        return userService.selectAll();
    }

    @RequestMapping("/selectById")
    @ResponseBody
    public User selectById(int userId) {
        return userService.selectById(userId);

    }

    @RequestMapping("/insert")
    @ResponseBody
    public int insert(User user) {
        return userService.insert(user);
    }

    @RequestMapping("/update")
    @ResponseBody
    public int update(User user){
        return userService.update(user);
    }
    @RequestMapping("/deleteById")
    @ResponseBody
    public int deleteById(int userId){
        return userService.deleteById(userId);
    }


}
