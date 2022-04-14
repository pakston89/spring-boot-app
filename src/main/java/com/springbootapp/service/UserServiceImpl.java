package com.springbootapp.service;

import com.springbootapp.exception.AlreadyExistsException;
import com.springbootapp.exception.NotFoundException;
import com.springbootapp.model.Role;
import com.springbootapp.model.User;
import com.springbootapp.model.UserDto;
import com.springbootapp.model.mapper.UserMapper;
import com.springbootapp.repository.UserRepository;
import com.springbootapp.security.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private BCryptPasswordEncoder bCrypt;

    @Override
    public void register(UserDto userDto) {

        if (userRepository.findByUserName(userDto.getUserName()) == null) {
            userDto.setPassword(bCrypt.encode(userDto.getPassword()));
            userRepository.saveAndFlush(userMapper.DTOToEntity(userDto));
        }
        else {
            throw new AlreadyExistsException("A user with this user name already exists");
        }
    }

    public String login(UserDto userDto) {

        User userToUpdate = userRepository.findByUserName(userDto.getUserName());

        if (userToUpdate == null) {
            throw new NotFoundException("This user name does not exist");
        }
        else if (userToUpdate != null && !bCrypt.matches(userDto.getPassword(), userToUpdate.getPassword())) {
            throw new NotFoundException("This password is not correct");
        }
        else {
            String token = JwtUtils.generateJwtToken(userDto.getUserName());
            userToUpdate.setToken(token);
            userRepository.saveAndFlush(userToUpdate);
            return token;
        }
    }

    public UserDto getUserByName(String userName) {
        for (Role role : userRepository.findByUserName(userName).getRoles()) {
            System.out.println(role.getName());
        }
        return userMapper.entityToDTO(userRepository.findByUserName(userName));
    }
}
