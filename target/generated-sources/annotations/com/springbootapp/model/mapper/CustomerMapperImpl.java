package com.springbootapp.model.mapper;

import com.springbootapp.model.Customer;
import com.springbootapp.model.CustomerDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-13T15:03:26+0200",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDto entityToDTO(Customer entity) {
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
    public Customer DTOToEntity(CustomerDto dto) {
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
    public List<CustomerDto> entitiesToDTOs(List<Customer> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CustomerDto> list = new ArrayList<CustomerDto>( entities.size() );
        for ( Customer customer : entities ) {
            list.add( entityToDTO( customer ) );
        }

        return list;
    }

    @Override
    public List<CustomerDto> DTOsToEntities(List<CustomerDto> dto) {
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
