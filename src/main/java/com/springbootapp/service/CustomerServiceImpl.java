package com.springbootapp.service;

import com.springbootapp.model.Customer;
import com.springbootapp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.getAll();
    }

    @Override
    public Customer getCustomerById(Integer id) {
        return customerRepository.getById(id);
    }

    @Override
    public void addCustomer(Customer customer) {
        customerRepository.save(customer);
    }
}