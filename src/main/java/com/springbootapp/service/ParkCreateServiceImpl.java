package com.springbootapp.service;

import com.springbootapp.dto.ParkDto;
import com.springbootapp.dto.mapper.ParkMapper;
import com.springbootapp.repository.ParkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Park create service implementation class.
 * @author pause
 */
@Service
public class ParkCreateServiceImpl implements ParkCreateService {

    @Autowired
    private ParkRepository parkRepository;

    @Autowired
    private ParkMapper parkMapper;

    @Override
    public void createPark(ParkDto parkDto) {
        parkDto.setStartDate((System.currentTimeMillis() - 7200000) / 1000);
        parkDto.setEndDate(System.currentTimeMillis() / 1000);
        parkRepository.saveAndFlush(parkMapper.dtoToEntity(parkDto));
    }
}
