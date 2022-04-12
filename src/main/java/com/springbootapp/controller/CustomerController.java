package com.springbootapp.controller;

import com.springbootapp.model.CustomerDto;
import com.springbootapp.service.CustomerService;
import com.springbootapp.util.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/{nif}")
    public CustomerDto getCustomerByNif(@PathVariable String nif) {
        Logger.LOGGER.info("getCustomerByNif -- Params: " + nif);
        return customerService.getCustomerByNif(nif);
    }

    @PostMapping("/register")
    public void registerCustomer(@RequestBody CustomerDto customerDTO) {
        Logger.LOGGER.info("registerCustomer -- Params: " + customerDTO.toString());
        customerService.createOrUpdate(customerDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomerById(@PathVariable Integer id) {
        Logger.LOGGER.info("deleteCustomerById -- Params: " + id);
        customerService.deleteCustomerById(id);
    }
}
