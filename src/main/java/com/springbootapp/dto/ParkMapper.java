package com.springbootapp.dto;

import com.springbootapp.model.Park;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface ParkMapper {

    ParkDto parkToParkDto(Park park);

    List<ParkDto> parksToParksDto(List<Park> parks);

    Park parkDtoToPark(ParkDto parkDto);
}
