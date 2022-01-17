package com.springbootapp.springbootapp.controller;

import com.springbootapp.springbootapp.model.Customer;
import com.springbootapp.springbootapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService customerServiceImpl;

    @Autowired
    public CustomerController(CustomerService customerServiceImpl) {
        this.customerServiceImpl = customerServiceImpl;
    }

    @GetMapping("/getAllCustomers")
    public List<Customer> getAll() {
        return customerServiceImpl.getAll();
    }

    @GetMapping("/getCustomerById")
    public Customer getById(@Param("id") Integer id) {
        return customerServiceImpl.getById(id);
    }

    @PostMapping("/addCustomer")
    public void addCustomer(@RequestBody Customer customer) {
        customerServiceImpl.addCustomer(customer);
    }
}
