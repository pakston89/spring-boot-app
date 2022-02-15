package com.springbootapp.dto.mapper;

import com.springbootapp.dto.CustomerDto;
import com.springbootapp.model.Customer;
import org.mapstruct.Mapper;

/**
 * The Customer mapper interface
 * @author pause
 */
@Mapper(componentModel = "spring")
public interface CustomerMapper extends BaseMapper<CustomerDto, Customer>{
}
