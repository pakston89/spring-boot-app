package com.springbootapp.springbootapp.dto;

import com.springbootapp.springbootapp.enums.CustomerStatus;
import com.springbootapp.springbootapp.model.Customer;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-17T18:45:44+0100",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDto customerToCustomerDto(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        Integer id = null;
        Long idp = null;
        String firstName = null;
        String lastName = null;
        CustomerStatus status = null;
        String nif = null;
        Long cardNumber = null;

        id = customer.getId();
        idp = customer.getIdp();
        firstName = customer.getFirstName();
        lastName = customer.getLastName();
        status = customer.getStatus();
        nif = customer.getNif();
        cardNumber = customer.getCardNumber();

        CustomerDto customerDto = new CustomerDto( id, idp, firstName, lastName, status, nif, cardNumber );

        return customerDto;
    }

    @Override
    public List<CustomerDto> customersToCustomersDto(List<Customer> customers) {
        if ( customers == null ) {
            return null;
        }

        List<CustomerDto> list = new ArrayList<CustomerDto>( customers.size() );
        for ( Customer customer : customers ) {
            list.add( customerToCustomerDto( customer ) );
        }

        return list;
    }

    @Override
    public Customer customerDtoToCustomer(CustomerDto customerDto) {
        if ( customerDto == null ) {
            return null;
        }

        Customer customer = new Customer();

        return customer;
    }
}