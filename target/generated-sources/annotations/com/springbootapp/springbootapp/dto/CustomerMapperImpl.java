package com.springbootapp.springbootapp.dto;

import com.springbootapp.springbootapp.enums.CustomerStatus;
import com.springbootapp.springbootapp.model.Customer;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-20T14:29:39+0100",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 1.4.50.v20210914-1429, environment: Java 17.0.1 (Eclipse Adoptium)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDto customerToCustomerDto(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        Long cardNumber = null;
        String firstName = null;
        Integer id = null;
        Long idp = null;
        String lastName = null;
        String nif = null;
        CustomerStatus status = null;

        cardNumber = customer.getCardNumber();
        firstName = customer.getFirstName();
        id = customer.getId();
        idp = customer.getIdp();
        lastName = customer.getLastName();
        nif = customer.getNif();
        status = customer.getStatus();

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

        customer.setCardNumber( customerDto.getCardNumber() );
        customer.setFirstName( customerDto.getFirstName() );
        customer.setId( customerDto.getId() );
        customer.setIdp( customerDto.getIdp() );
        customer.setLastName( customerDto.getLastName() );
        customer.setNif( customerDto.getNif() );
        customer.setStatus( customerDto.getStatus() );

        return customer;
    }
}
