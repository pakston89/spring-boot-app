package com.springbootapp.service;

import com.springbootapp.model.ParkDto;
import com.springbootapp.model.mapper.ParkMapper;
import com.springbootapp.repository.ParkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkServiceImpl implements ParkService {

    @Autowired
    private ParkRepository parkRepository;

    @Autowired
    private ParkMapper parkMapper;

    @Override
    public void createPark(ParkDto parkDTO) {
        parkDTO.setStartDate((System.currentTimeMillis() - 7200000) / 1000);
        parkDTO.setEndDate(System.currentTimeMillis() / 1000);
        parkRepository.saveAndFlush(parkMapper.DTOToEntity(parkDTO));
    }
}
