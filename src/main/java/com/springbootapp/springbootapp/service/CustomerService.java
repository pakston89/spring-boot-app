package com.springbootapp.springbootapp.service;

import com.springbootapp.springbootapp.model.Customer;
import java.util.List;

public interface CustomerService {

    public List<Customer> getAll();

    public Customer getById(Integer id);

    public void addCustomer(Customer customer);
}