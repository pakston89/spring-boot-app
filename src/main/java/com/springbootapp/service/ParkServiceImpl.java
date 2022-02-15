package com.springbootapp.service;

import com.springbootapp.dto.ParkDto;
import com.springbootapp.repository.ParkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * The Park service implementation class.
 * @author pause
 */
@Service
public class ParkServiceImpl implements ParkService {

    @Autowired
    private ParkRepository parkRepository;

    @Autowired
    private ParkMapper parkMapper;

    @Override
    public List<ParkDto> getAllParks() {
        return parkMapper.parksToParksDto(parkRepository.getAll());
    }

    @Override
    public void savePark(ParkDto parkDto) {
        parkDto.setStartDate((System.currentTimeMillis() - 7200000) / 1000);
        parkDto.setEndDate(System.currentTimeMillis() / 1000);
        parkRepository.save(parkMapper.parkDtoToPark(parkDto));

    }
}
