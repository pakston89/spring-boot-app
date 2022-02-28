package com.springbootapp.controller;

import com.springbootapp.model.CustomerVO;
import com.springbootapp.service.CustomerService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Log4j2
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/register")
    public void registerCustomer(@RequestBody CustomerVO customerVO) {
        log.info("registerCustomer -- Params: " + customerVO.toString());
        customerService.createOrUpdate(customerVO);

    }
}
