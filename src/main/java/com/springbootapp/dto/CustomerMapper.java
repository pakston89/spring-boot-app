package com.springbootapp.dto;

import com.springbootapp.model.Customer;
import org.mapstruct.Mapper;
import java.util.List;

/**
 * The Customer mapper class.
 * ComponentModel = "spring" produces a bean to inject it anywhere.
 * @author pause
 */
@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    List<CustomerDto> customersToCustomersDto(List<Customer> customers);

    Customer customerDtoToCustomer(CustomerDto customerDto);
}

