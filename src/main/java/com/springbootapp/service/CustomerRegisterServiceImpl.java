package com.springbootapp.service;

import com.springbootapp.dto.CustomerDto;
import com.springbootapp.dto.mapper.CustomerMapper;
import com.springbootapp.model.Customer;
import com.springbootapp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Customer register service implementation class.
 * @author pause
 */
@Service
public class CustomerRegisterServiceImpl implements CustomerRegisterService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public void createOrUpdate(CustomerDto customerDto) {
        Customer customerToUpdate = customerRepository.getByNif(customerDto.getNif());

        if (customerToUpdate == null) {
            customerRepository.saveAndFlush(customerMapper.dtoToEntity(customerDto));
        }
        else {
            if (customerDto.getIdp() != null) {
                customerToUpdate.setIdp(customerDto.getIdp());
            }

            if (customerDto.getNif() != null) {
                customerToUpdate.setNif(customerDto.getNif());
            }

            if (customerDto.getFirstName() != null) {
                customerToUpdate.setFirstName(customerDto.getFirstName());
            }

            if (customerDto.getLastName() != null) {
                customerToUpdate.setLastName(customerDto.getLastName());
            }

            if (customerDto.getStatus() != null) {
                customerToUpdate.setStatus(customerDto.getStatus());
            }

            if (customerDto.getCardNumber() != null) {
                customerToUpdate.setCardNumber(customerDto.getCardNumber());
            }

            customerRepository.saveAndFlush(customerToUpdate);
        }
    }
}