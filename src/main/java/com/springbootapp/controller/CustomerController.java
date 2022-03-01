package com.springbootapp.controller;

import com.springbootapp.model.CustomerVO;
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
    public CustomerVO getCustomerByNif(@PathVariable String nif) {
        Logger.LOGGER.info("getCustomerByNif -- Params: " + nif);
        return customerService.getCustomerByNif(nif);
    }

    @PostMapping("/register")
    public void registerCustomer(@RequestBody CustomerVO customerVO) {
        Logger.LOGGER.info("registerCustomer -- Params: " + customerVO.toString());
        customerService.createOrUpdate(customerVO);

    }
}
