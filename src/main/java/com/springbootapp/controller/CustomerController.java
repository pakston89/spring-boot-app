package com.springbootapp.controller;

import com.springbootapp.dto.CustomerDto;
import com.springbootapp.dto.CustomerMapper;
import com.springbootapp.service.CustomerService;
import com.springbootapp.util.LoggerConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * The customer controller class.
 * @author pause
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerMapper customerMapper;

    @GetMapping("/getAllCustomers")
    public List<CustomerDto> getAllCustomers() {
        LoggerConstants.CustomerControllerLog.info("getAllCustomers -- Params: " + "none");
        return customerMapper.customersToCustomersDto(customerService.getAllCustomers());
    }

    @GetMapping("/getCustomerById")
    public CustomerDto getCustomerById(@Param("id") Integer id) {
        LoggerConstants.CustomerControllerLog.info("getCustomerById -- Params: " + id);
        return customerMapper.customerToCustomerDto(customerService.getCustomerById(id));
    }

    @PostMapping("/saveCustomer")
    public void addCustomer(@RequestBody CustomerDto customerDto) {
        LoggerConstants.CustomerControllerLog.info("addCustomer -- Params: " + customerDto.toString());
        customerService.saveCustomer(customerMapper.customerDtoToCustomer(customerDto));
    }
}
