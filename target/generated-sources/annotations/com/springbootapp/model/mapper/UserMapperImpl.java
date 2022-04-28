package com.springbootapp.model.mapper;

import com.springbootapp.model.User;
import com.springbootapp.model.UserDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-28T11:13:55+0200",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto entityToDTO(User entity) {
        if ( entity == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( entity.getId() );
        userDto.setUserName( entity.getUserName() );
        userDto.setPassword( entity.getPassword() );

        return userDto;
    }

    @Override
    public User DTOToEntity(UserDto dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setId( dto.getId() );
        user.setUserName( dto.getUserName() );
        user.setPassword( dto.getPassword() );

        return user;
    }

    @Override
    public List<UserDto> entitiesToDTOs(List<User> entities) {
        if ( entities == null ) {
            return null;
        }

        List<UserDto> list = new ArrayList<UserDto>( entities.size() );
        for ( User user : entities ) {
            list.add( entityToDTO( user ) );
        }

        return list;
    }

    @Override
    public List<UserDto> DTOsToEntities(List<UserDto> dto) {
        if ( dto == null ) {
            return null;
        }

        List<UserDto> list = new ArrayList<UserDto>( dto.size() );
        for ( UserDto userDto : dto ) {
            list.add( userDto );
        }

        return list;
    }
}
