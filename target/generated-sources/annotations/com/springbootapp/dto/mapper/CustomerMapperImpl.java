package com.springbootapp.dto.mapper;

import com.springbootapp.dto.CustomerDto;
import com.springbootapp.model.Customer;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-15T20:30:06+0100",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDto entityToDto(Customer entity) {
        if ( entity == null ) {
            return null;
        }

        CustomerDto customerDto = new CustomerDto();

        customerDto.setId( entity.getId() );
        customerDto.setIdp( entity.getIdp() );
        customerDto.setFirstName( entity.getFirstName() );
        customerDto.setLastName( entity.getLastName() );
        customerDto.setStatus( entity.getStatus() );
        customerDto.setNif( entity.getNif() );
        customerDto.setCardNumber( entity.getCardNumber() );

        return customerDto;
    }

    @Override
    public Customer dtoToEntity(CustomerDto dto) {
        if ( dto == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setId( dto.getId() );
        customer.setIdp( dto.getIdp() );
        customer.setFirstName( dto.getFirstName() );
        customer.setLastName( dto.getLastName() );
        customer.setStatus( dto.getStatus() );
        customer.setNif( dto.getNif() );
        customer.setCardNumber( dto.getCardNumber() );

        return customer;
    }

    @Override
    public List<CustomerDto> entitiesToDtos(List<Customer> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CustomerDto> list = new ArrayList<CustomerDto>( entities.size() );
        for ( Customer customer : entities ) {
            list.add( entityToDto( customer ) );
        }

        return list;
    }

    @Override
    public List<CustomerDto> dtosToEntities(List<CustomerDto> dto) {
        if ( dto == null ) {
            return null;
        }

        List<CustomerDto> list = new ArrayList<CustomerDto>( dto.size() );
        for ( CustomerDto customerDto : dto ) {
            list.add( customerDto );
        }

        return list;
    }
}
