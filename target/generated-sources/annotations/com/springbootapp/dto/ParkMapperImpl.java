package com.springbootapp.dto;

import com.springbootapp.model.Park;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-14T19:29:16+0100",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class ParkMapperImpl implements ParkMapper {

    @Override
    public ParkDto parkToParkDto(Park park) {
        if ( park == null ) {
            return null;
        }

        ParkDto parkDto = new ParkDto();

        parkDto.setId( park.getId() );
        parkDto.setCustomerId( park.getCustomerId() );
        parkDto.setCustomerIdp( park.getCustomerIdp() );
        parkDto.setParkingId( park.getParkingId() );
        parkDto.setParkingLotId( park.getParkingLotId() );
        parkDto.setStartDate( park.getStartDate() );
        parkDto.setEndDate( park.getEndDate() );

        return parkDto;
    }

    @Override
    public List<ParkDto> parksToParksDto(List<Park> parks) {
        if ( parks == null ) {
            return null;
        }

        List<ParkDto> list = new ArrayList<ParkDto>( parks.size() );
        for ( Park park : parks ) {
            list.add( parkToParkDto( park ) );
        }

        return list;
    }

    @Override
    public Park parkDtoToPark(ParkDto parkDto) {
        if ( parkDto == null ) {
            return null;
        }

        Park park = new Park();

        park.setId( parkDto.getId() );
        park.setCustomerId( parkDto.getCustomerId() );
        park.setCustomerIdp( parkDto.getCustomerIdp() );
        park.setParkingId( parkDto.getParkingId() );
        park.setParkingLotId( parkDto.getParkingLotId() );
        park.setStartDate( parkDto.getStartDate() );
        park.setEndDate( parkDto.getEndDate() );

        return park;
    }
}
