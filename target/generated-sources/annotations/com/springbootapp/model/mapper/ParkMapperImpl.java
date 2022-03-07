package com.springbootapp.model.mapper;

import com.springbootapp.model.Park;
import com.springbootapp.model.ParkDTO;
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
public class ParkMapperImpl implements ParkMapper {

    @Override
    public ParkDTO entityToDTO(Park entity) {
        if ( entity == null ) {
            return null;
        }

        ParkDTO parkDTO = new ParkDTO();

        parkDTO.setId( entity.getId() );
        parkDTO.setCustomerId( entity.getCustomerId() );
        parkDTO.setCustomerIdp( entity.getCustomerIdp() );
        parkDTO.setParkingId( entity.getParkingId() );
        parkDTO.setParkingLotId( entity.getParkingLotId() );
        parkDTO.setStartDate( entity.getStartDate() );
        parkDTO.setEndDate( entity.getEndDate() );

        return parkDTO;
    }

    @Override
    public Park DTOToEntity(ParkDTO dto) {
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
    public List<ParkDTO> entitiesToDTOs(List<Park> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ParkDTO> list = new ArrayList<ParkDTO>( entities.size() );
        for ( Park park : entities ) {
            list.add( entityToDTO( park ) );
        }

        return list;
    }

    @Override
    public List<ParkDTO> DTOsToEntities(List<ParkDTO> dto) {
        if ( dto == null ) {
            return null;
        }

        List<ParkDTO> list = new ArrayList<ParkDTO>( dto.size() );
        for ( ParkDTO parkDTO : dto ) {
            list.add( parkDTO );
        }

        return list;
    }
}
