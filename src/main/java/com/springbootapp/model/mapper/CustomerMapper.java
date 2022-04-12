package com.springbootapp.model.mapper;

import com.springbootapp.model.Customer;
import com.springbootapp.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper extends BaseMapper<CustomerDto, Customer>{
}
