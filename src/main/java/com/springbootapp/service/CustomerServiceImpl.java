package com.springbootapp.service;

import com.springbootapp.exception.NotFoundException;
import com.springbootapp.model.CustomerDto;
import com.springbootapp.model.mapper.CustomerMapper;
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
    public CustomerDto getCustomerByNif(String nif) {
        return customerMapper.entityToDTO(customerRepository.getByNif(nif));
    }

    @Override
    public void createOrUpdate(CustomerDto customerDTO) {
        Customer customerToUpdate = customerRepository.getByNif(customerDTO.getNif());

        if (customerToUpdate == null) {
            customerRepository.saveAndFlush(customerMapper.DTOToEntity(customerDTO));
        }
        else {
            if (customerDTO.getIdp() != null) {
                customerToUpdate.setIdp(customerDTO.getIdp());
            }

            if (customerDTO.getNif() != null) {
                customerToUpdate.setNif(customerDTO.getNif());
            }

            if (customerDTO.getFirstName() != null) {
                customerToUpdate.setFirstName(customerDTO.getFirstName());
            }

            if (customerDTO.getLastName() != null) {
                customerToUpdate.setLastName(customerDTO.getLastName());
            }

            if (customerDTO.getStatus() != null) {
                customerToUpdate.setStatus(customerDTO.getStatus());
            }

            if (customerDTO.getCardNumber() != null) {
                customerToUpdate.setCardNumber(customerDTO.getCardNumber());
            }

            customerRepository.saveAndFlush(customerToUpdate);
        }
    }

    @Override
    public void deleteCustomerById(Integer id) {
        if(customerRepository.findById(id).isEmpty()) {
            throw new NotFoundException("The customer does not exist");
        }
        else {
            customerRepository.deleteById(id);
        }
    }
}