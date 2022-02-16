package com.springbootapp.dto.mapper;

import com.springbootapp.dto.ParkDto;
import com.springbootapp.model.Park;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-16T21:46:56+0100",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class ParkMapperImpl implements ParkMapper {

    @Override
    public ParkDto entityToDto(Park entity) {
        if ( entity == null ) {
            return null;
        }

        ParkDto parkDto = new ParkDto();

        parkDto.setId( entity.getId() );
        parkDto.setCustomerId( entity.getCustomerId() );
        parkDto.setCustomerIdp( entity.getCustomerIdp() );
        parkDto.setParkingId( entity.getParkingId() );
        parkDto.setParkingLotId( entity.getParkingLotId() );
        parkDto.setStartDate( entity.getStartDate() );
        parkDto.setEndDate( entity.getEndDate() );

        return parkDto;
    }

    @Override
    public Park dtoToEntity(ParkDto dto) {
        if ( dto == null ) {
            return null;
        }

        Park park = new Park();

        park.setId( dto.getId() );
        park.setCustomerId( dto.getCustomerId() );
        park.setCustomerIdp( dto.getCustomerIdp() );
        park.setParkingId( dto.getParkingId() );
        park.setParkingLotId( dto.getParkingLotId() );
        park.setStartDate( dto.getStartDate() );
        park.setEndDate( dto.getEndDate() );

        return park;
    }

    @Override
    public List<ParkDto> entitiesToDtos(List<Park> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ParkDto> list = new ArrayList<ParkDto>( entities.size() );
        for ( Park park : entities ) {
            list.add( entityToDto( park ) );
        }

        return list;
    }

    @Override
    public List<ParkDto> dtosToEntities(List<ParkDto> dto) {
        if ( dto == null ) {
            return null;
        }

        List<ParkDto> list = new ArrayList<ParkDto>( dto.size() );
        for ( ParkDto parkDto : dto ) {
            list.add( parkDto );
        }

        return list;
    }
}
