package com.springbootapp.service;

import com.springbootapp.dto.CustomerDto;
import java.util.List;

/**
 * The Customer service interface.
 * @author pause
 */
public interface CustomerService {

    public List<CustomerDto> getAllCustomers();

    public CustomerDto getCustomerById(Integer id);

    public void saveCustomer(CustomerDto customerDto);
}