package com.springbootapp.controller;

import com.springbootapp.model.UserDto;
import com.springbootapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(@RequestBody UserDto userDto) {
        return userService.login(userDto);
    }
}
