package com.springbootapp.service;

import com.springbootapp.dto.CustomerVO;

public interface CustomerService {

    public void createOrUpdate(CustomerVO customerVO);
}