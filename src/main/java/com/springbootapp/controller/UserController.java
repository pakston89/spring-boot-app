package com.springbootapp.controller;

import com.springbootapp.model.UserDto;
import com.springbootapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public void register(@RequestBody UserDto userDto) {
        userService.register(userDto);
    }

    @PostMapping("/login")
    public String login(@RequestBody UserDto userDto) {
        return userService.login(userDto);
    }

    @GetMapping()
    public UserDto getUserByName(@PathVariable String userName) {
        return userService.getUserByName(userName);
    }
}
