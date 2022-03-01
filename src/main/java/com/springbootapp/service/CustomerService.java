package com.springbootapp.service;

import com.springbootapp.model.CustomerVO;

public interface CustomerService {

    public CustomerVO getCustomerByNif(String nif);

    public void createOrUpdate(CustomerVO customerVO);
}