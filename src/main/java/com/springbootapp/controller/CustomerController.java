package com.springbootapp.controller;

import com.springbootapp.model.CustomerVO;
import com.springbootapp.service.CustomerService;
import com.springbootapp.util.LoggerConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/register")
    public void registerCustomer(@RequestBody CustomerVO customerVO) {
        LoggerConstants.CustomerControllerLog.info("registerCustomer -- Params: " + customerVO.toString());
        customerService.createOrUpdate(customerVO);
    }
}
