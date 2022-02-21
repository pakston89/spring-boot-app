package com.springbootapp.controller;

import com.springbootapp.dto.CustomerDto;
import com.springbootapp.service.CustomerRegisterService;
import com.springbootapp.util.LoggerConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * The Customer register controller class.
 * @author pause
 */
@RestController
public class CustomerRegisterController {

    @Autowired
    private CustomerRegisterService customeRregisterService;

    @PostMapping("/customer")
    public void registerCustomer(@RequestBody CustomerDto customerDto) {
        LoggerConstants.CustomerControllerLog.info("registerCustomer -- Params: " + customerDto.toString());
        customeRregisterService.createOrUpdate(customerDto);
    }
}
