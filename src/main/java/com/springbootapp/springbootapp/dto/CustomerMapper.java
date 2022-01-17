package com.springbootapp.springbootapp.dto;

import com.springbootapp.springbootapp.model.Customer;
import org.mapstruct.Mapper;
import java.util.List;

//ComponentModel = "spring" produces a bean to inject it anywhere
@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    List<CustomerDto> customersToCustomersDto(List<Customer> customers);

    Customer customerDtoToCustomer(CustomerDto customerDto);
}

