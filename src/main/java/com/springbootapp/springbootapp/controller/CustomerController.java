package com.springbootapp.springbootapp.controller;

import com.springbootapp.springbootapp.dto.CustomerDto;
import com.springbootapp.springbootapp.dto.CustomerMapper;
import com.springbootapp.springbootapp.service.CustomerService;
import com.springbootapp.springbootapp.util.LoggerConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerServiceImpl;

    private final CustomerMapper customerMapper;

    @Autowired
    public CustomerController(CustomerService customerServiceImpl, CustomerMapper customerMapper) {
        this.customerServiceImpl = customerServiceImpl;
        this.customerMapper = customerMapper;
    }

    @GetMapping("/getAllCustomers")
    public List<CustomerDto> getAllCustomers() {
        return customerMapper.customersToCustomersDto(customerServiceImpl.getAllCustomers());
    }

    @GetMapping("/getCustomerById")
    public CustomerDto getCustomerById(@Param("id") Integer id) {
        LoggerConstants.CustomerControllerLog.info("getCustomerById -- Params: " + id);
        return customerMapper.customerToCustomerDto(customerServiceImpl.getCustomerById(id));
    }

    @PostMapping("/addCustomer")
    public void addCustomer(@RequestBody CustomerDto customerDto) {
        LoggerConstants.CustomerControllerLog.info("getCustomerById -- Params: " + customerDto.toString());
        customerServiceImpl.addCustomer(customerMapper.customerDtoToCustomer(customerDto));
    }
}
