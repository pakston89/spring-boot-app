package com.springbootapp.service;

import com.springbootapp.model.Customer;
import java.util.List;

/**
 * The Customer service interface.
 * @author pause
 */
public interface CustomerService {

    public List<Customer> getAllCustomers();

    public Customer getCustomerById(Integer id);

    public void addCustomer(Customer customer);
}