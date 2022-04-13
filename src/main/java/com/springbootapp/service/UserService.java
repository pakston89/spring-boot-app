package com.springbootapp.service;

import com.springbootapp.model.UserDto;

public interface UserService {

    public void register(UserDto userDto);

    public String login(UserDto userDto);
}
