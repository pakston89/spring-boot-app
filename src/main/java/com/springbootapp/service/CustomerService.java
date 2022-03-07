package com.springbootapp.service;

import com.springbootapp.model.CustomerDTO;

public interface CustomerService {

    public CustomerDTO getCustomerByNif(String nif);

    public void createOrUpdate(CustomerDTO customerDTO);

    public void deleteCustomerById(Integer id);
}