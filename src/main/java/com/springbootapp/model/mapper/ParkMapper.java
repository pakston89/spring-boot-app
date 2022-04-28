package com.springbootapp.model.mapper;

import com.springbootapp.model.dto.ParkDto;
import com.springbootapp.model.Park;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ParkMapper extends BaseMapper<ParkDto, Park>{
}
