package com.springbootapp.service;

import com.springbootapp.dto.CustomerVO;
import com.springbootapp.dto.mapper.CustomerMapper;
import com.springbootapp.model.Customer;
import com.springbootapp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public void createOrUpdate(CustomerVO customerVO) {
        Customer customerToUpdate = customerRepository.getByNif(customerVO.getNif());

        if (customerToUpdate == null) {
            customerRepository.saveAndFlush(customerMapper.VOToEntity(customerVO));
        }
        else {
            if (customerVO.getIdp() != null) {
                customerToUpdate.setIdp(customerVO.getIdp());
            }

            if (customerVO.getNif() != null) {
                customerToUpdate.setNif(customerVO.getNif());
            }

            if (customerVO.getFirstName() != null) {
                customerToUpdate.setFirstName(customerVO.getFirstName());
            }

            if (customerVO.getLastName() != null) {
                customerToUpdate.setLastName(customerVO.getLastName());
            }

            if (customerVO.getStatus() != null) {
                customerToUpdate.setStatus(customerVO.getStatus());
            }

            if (customerVO.getCardNumber() != null) {
                customerToUpdate.setCardNumber(customerVO.getCardNumber());
            }

            customerRepository.saveAndFlush(customerToUpdate);
        }
    }
}