package com.springbootapp.dto.mapper;

import com.springbootapp.dto.ParkDto;
import com.springbootapp.model.Park;
import org.mapstruct.Mapper;

/**
 * The Park mapper interface
 * @author pause
 */
@Mapper(componentModel = "spring")
public interface ParkMapper extends BaseMapper<ParkDto, Park>{
}
