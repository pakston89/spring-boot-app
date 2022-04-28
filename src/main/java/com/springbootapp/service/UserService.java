package com.springbootapp.service;

import com.springbootapp.model.dto.UserDto;

public interface UserService {

    public void register(UserDto userDto);

    public String login(UserDto userDto);

    public UserDto getUserByName(String name);
}
