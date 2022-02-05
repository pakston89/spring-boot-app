package com.springbootapp.dto;

import com.springbootapp.model.Customer;
import com.springbootapp.model.Park;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * The Park mapper interface.
 * ComponentModel = "spring" produces a bean to inject it anywhere.
 * @author pause
 */
@Mapper(componentModel = "spring")
public interface ParkMapper {

    ParkDto parkToParkDto(Park park);

    List<ParkDto> parksToParksDto(List<Park> parks);

    Park parkDtoToPark(ParkDto parkDto);
}
