package com.springbootapp.model.mapper;

import com.springbootapp.model.Park;
import com.springbootapp.model.ParkVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-26T16:25:50+0100",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.11 (Oracle Corporation)"
)
@Component
public class ParkMapperImpl implements ParkMapper {

    @Override
    public ParkVO entityToVO(Park entity) {
        if ( entity == null ) {
            return null;
        }

        ParkVO parkVO = new ParkVO();

        parkVO.setId( entity.getId() );
        parkVO.setCustomerId( entity.getCustomerId() );
        parkVO.setCustomerIdp( entity.getCustomerIdp() );
        parkVO.setParkingId( entity.getParkingId() );
        parkVO.setParkingLotId( entity.getParkingLotId() );
        parkVO.setStartDate( entity.getStartDate() );
        parkVO.setEndDate( entity.getEndDate() );

        return parkVO;
    }

    @Override
    public Park VOToEntity(ParkVO dto) {
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
    public List<ParkVO> entitiesToVOs(List<Park> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ParkVO> list = new ArrayList<ParkVO>( entities.size() );
        for ( Park park : entities ) {
            list.add( entityToVO( park ) );
        }

        return list;
    }

    @Override
    public List<ParkVO> VOsToEntities(List<ParkVO> dto) {
        if ( dto == null ) {
            return null;
        }

        List<ParkVO> list = new ArrayList<ParkVO>( dto.size() );
        for ( ParkVO parkVO : dto ) {
            list.add( parkVO );
        }

        return list;
    }
}
