package com.springbootapp.service;

import com.springbootapp.model.dto.CustomerDto;

public interface CustomerService {

    public CustomerDto getCustomerByNif(String nif);

    public void createOrUpdate(CustomerDto customerDTO);

    public void deleteCustomerById(Integer id);
}