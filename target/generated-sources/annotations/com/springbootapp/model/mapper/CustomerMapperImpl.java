package com.springbootapp.model.mapper;

import com.springbootapp.model.Customer;
import com.springbootapp.model.CustomerVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-26T16:29:23+0100",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerVO entityToVO(Customer entity) {
        if ( entity == null ) {
            return null;
        }

        CustomerVO customerVO = new CustomerVO();

        customerVO.setId( entity.getId() );
        customerVO.setIdp( entity.getIdp() );
        customerVO.setFirstName( entity.getFirstName() );
        customerVO.setLastName( entity.getLastName() );
        customerVO.setStatus( entity.getStatus() );
        customerVO.setNif( entity.getNif() );
        customerVO.setCardNumber( entity.getCardNumber() );

        return customerVO;
    }

    @Override
    public Customer VOToEntity(CustomerVO dto) {
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
    public List<CustomerVO> entitiesToVOs(List<Customer> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CustomerVO> list = new ArrayList<CustomerVO>( entities.size() );
        for ( Customer customer : entities ) {
            list.add( entityToVO( customer ) );
        }

        return list;
    }

    @Override
    public List<CustomerVO> VOsToEntities(List<CustomerVO> dto) {
        if ( dto == null ) {
            return null;
        }

        List<CustomerVO> list = new ArrayList<CustomerVO>( dto.size() );
        for ( CustomerVO customerVO : dto ) {
            list.add( customerVO );
        }

        return list;
    }
}
