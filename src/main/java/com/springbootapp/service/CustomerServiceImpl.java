package com.springbootapp.service;

import com.springbootapp.dto.CustomerDto;
import com.springbootapp.dto.mapper.CustomerMapper;
import com.springbootapp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * The Customer service implementation class.
 * @author pause
 */
@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<CustomerDto> getAllCustomers() {
        return customerMapper.entitiesToDtos(customerRepository.getAll());
    }

    @Override
    public CustomerDto getCustomerById(Integer id) {
        return customerMapper.entityToDto(customerRepository.getById(id));
    }

    @Override
    public void saveCustomer(CustomerDto customerDto) {
        customerRepository.save(customerMapper.dtoToEntity(customerDto));
    }
}