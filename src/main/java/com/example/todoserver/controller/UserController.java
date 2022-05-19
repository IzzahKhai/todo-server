package com.example.todoserver.controller;

import com.example.todoserver.entity.TbUser;
import com.example.todoserver.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public List<TbUser> getAllUser(){
        return userService.getAllUser();
    }
}
