package com.springbootapp.model.mapper;

import com.springbootapp.model.CustomerVO;
import com.springbootapp.model.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper extends BaseMapper<CustomerVO, Customer>{
}
