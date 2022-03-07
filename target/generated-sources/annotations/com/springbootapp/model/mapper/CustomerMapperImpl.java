package com.springbootapp.model.mapper;

import com.springbootapp.model.Customer;
import com.springbootapp.model.CustomerDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-07T21:00:30+0100",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDTO entityToDTO(Customer entity) {
        if ( entity == null ) {
            return null;
        }

        CustomerDTO customerDTO = new CustomerDTO();

        customerDTO.setId( entity.getId() );
        customerDTO.setIdp( entity.getIdp() );
        customerDTO.setFirstName( entity.getFirstName() );
        customerDTO.setLastName( entity.getLastName() );
        customerDTO.setStatus( entity.getStatus() );
        customerDTO.setNif( entity.getNif() );
        customerDTO.setCardNumber( entity.getCardNumber() );

        return customerDTO;
    }

    @Override
    public Customer DTOToEntity(CustomerDTO dto) {
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
    public List<CustomerDTO> entitiesToDTOs(List<Customer> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CustomerDTO> list = new ArrayList<CustomerDTO>( entities.size() );
        for ( Customer customer : entities ) {
            list.add( entityToDTO( customer ) );
        }

        return list;
    }

    @Override
    public List<CustomerDTO> DTOsToEntities(List<CustomerDTO> dto) {
        if ( dto == null ) {
            return null;
        }

        List<CustomerDTO> list = new ArrayList<CustomerDTO>( dto.size() );
        for ( CustomerDTO customerDTO : dto ) {
            list.add( customerDTO );
        }

        return list;
    }
}
