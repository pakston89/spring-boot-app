package com.springbootapp.dto;

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

    ParkGetDto parkToParkGetDto(Park park);
    List<ParkGetDto> parksToParksGetDto(List<Park> parks);
    Park parkGetDtoToPark(ParkGetDto parkGetDto);

    ParkPostDto parkToParkPostDto(Park park);
    List<ParkPostDto> parksToParksPostDto(List<Park> parks);
    Park parkPostDtoToPark(ParkPostDto parkPostDto);
}
