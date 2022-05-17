package com.springbootapp.service;

import com.springbootapp.exception.AlreadyExistsException;
import com.springbootapp.exception.NotFoundException;
import com.springbootapp.model.User;
import com.springbootapp.model.dto.UserDto;
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
    private JwtUtils jwtUtils;

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

        User user = userRepository.findByUserName(userDto.getUserName());

        if (user == null) {
            throw new NotFoundException("This user name does not exist");
        }
        else if (user != null && !bCrypt.matches(userDto.getPassword(), user.getPassword())) {
            throw new NotFoundException("This password is not correct");
        }
        else {

            String token = jwtUtils.generateJwtToken(user);
            return token;
        }
    }

    public UserDto getUserByName(String userName) {
        return userMapper.entityToDTO(userRepository.findByUserName(userName));
    }
}
