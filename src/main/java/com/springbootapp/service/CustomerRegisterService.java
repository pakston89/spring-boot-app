package com.springbootapp.service;

import com.springbootapp.dto.CustomerDto;

/**
 * The Customer register service interface.
 * @author pause
 */
public interface CustomerRegisterService {

    public void createOrUpdate(CustomerDto customerDto);
}