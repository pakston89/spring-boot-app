package com.springbootapp.dto.mapper;

import com.springbootapp.dto.CustomerVO;
import com.springbootapp.model.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper extends BaseMapper<CustomerVO, Customer>{
}
