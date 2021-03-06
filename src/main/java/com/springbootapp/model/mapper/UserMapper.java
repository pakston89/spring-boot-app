package com.springbootapp.model.mapper;

import com.springbootapp.model.User;
import com.springbootapp.model.dto.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends BaseMapper <UserDto, User> {
}
