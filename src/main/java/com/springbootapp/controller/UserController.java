package com.springbootapp.controller;

import com.springbootapp.model.dto.UserDto;
import com.springbootapp.service.UserService;
import com.springbootapp.util.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public void register(@RequestBody UserDto userDto) {
        Logger.LOGGER.info("register -- Params: " + userDto.toString());
        userService.register(userDto);
    }

    @PostMapping("/login")
    public String login(@RequestBody UserDto userDto) {
        return userService.login(userDto);
    }

    @GetMapping("/{userName}")
    public UserDto getUserByName(@PathVariable String userName) {
        Logger.LOGGER.info("getUserByName -- Params: " + userName);
        return userService.getUserByName(userName);
    }
}
