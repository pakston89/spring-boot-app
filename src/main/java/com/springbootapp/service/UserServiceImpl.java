package com.springbootapp.service;

import com.springbootapp.exception.NotFoundException;
import com.springbootapp.model.User;
import com.springbootapp.model.UserDto;
import com.springbootapp.model.mapper.UserMapper;
import com.springbootapp.repository.UserRepository;
import com.springbootapp.security.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public String login(UserDto userDto) {

        User userToUpdate = userRepository.findByUserName(userDto.getUserName());

        String token = JwtUtils.generateJwtToken(userDto.getUserName());

        if (userToUpdate == null) {
            throw new NotFoundException("This user name does not exist");
        }
        else if (userToUpdate != null && !Objects.equals(userToUpdate.getPassword(), userDto.getPassword())) {
            throw new NotFoundException("This password does not exist");
        }
        else {
            userToUpdate.setToken(JwtUtils.generateJwtToken(userDto.getUserName()));
            userRepository.saveAndFlush(userToUpdate);
            return token;
        }
    }
}
