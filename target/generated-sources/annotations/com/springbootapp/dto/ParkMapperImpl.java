package com.springbootapp.dto;

import com.springbootapp.model.Park;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-07T21:03:39+0100",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class ParkMapperImpl implements ParkMapper {

    @Override
    public ParkGetDto parkToParkGetDto(Park park) {
        if ( park == null ) {
            return null;
        }

        ParkGetDto parkGetDto = new ParkGetDto();

        parkGetDto.setId( park.getId() );
        parkGetDto.setCustomerId( park.getCustomerId() );
        parkGetDto.setCustomerIdp( park.getCustomerIdp() );
        parkGetDto.setParkingId( park.getParkingId() );
        parkGetDto.setParkingLotId( park.getParkingLotId() );
        parkGetDto.setStartDate( park.getStartDate() );
        parkGetDto.setEndDate( park.getEndDate() );

        return parkGetDto;
    }

    @Override
    public List<ParkGetDto> parksToParksGetDto(List<Park> parks) {
        if ( parks == null ) {
            return null;
        }

        List<ParkGetDto> list = new ArrayList<ParkGetDto>( parks.size() );
        for ( Park park : parks ) {
            list.add( parkToParkGetDto( park ) );
        }

        return list;
    }

    @Override
    public Park parkGetDtoToPark(ParkGetDto parkGetDto) {
        if ( parkGetDto == null ) {
            return null;
        }

        Park park = new Park();

        park.setId( parkGetDto.getId() );
        park.setCustomerId( parkGetDto.getCustomerId() );
        park.setCustomerIdp( parkGetDto.getCustomerIdp() );
        park.setParkingId( parkGetDto.getParkingId() );
        park.setParkingLotId( parkGetDto.getParkingLotId() );
        park.setStartDate( parkGetDto.getStartDate() );
        park.setEndDate( parkGetDto.getEndDate() );

        return park;
    }

    @Override
    public ParkPostDto parkToParkPostDto(Park park) {
        if ( park == null ) {
            return null;
        }

        ParkPostDto parkPostDto = new ParkPostDto();

        parkPostDto.setId( park.getId() );
        parkPostDto.setCustomerId( park.getCustomerId() );
        parkPostDto.setCustomerIdp( park.getCustomerIdp() );
        parkPostDto.setParkingId( park.getParkingId() );
        parkPostDto.setParkingLotId( park.getParkingLotId() );

        return parkPostDto;
    }

    @Override
    public Park parkPostDtoToPark(ParkPostDto parkPostDto) {
        if ( parkPostDto == null ) {
            return null;
        }

        Park park = new Park();

        park.setId( parkPostDto.getId() );
        park.setCustomerId( parkPostDto.getCustomerId() );
        park.setCustomerIdp( parkPostDto.getCustomerIdp() );
        park.setParkingId( parkPostDto.getParkingId() );
        park.setParkingLotId( parkPostDto.getParkingLotId() );

        return park;
    }
}
