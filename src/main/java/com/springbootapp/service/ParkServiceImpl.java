package com.springbootapp.service;

import com.springbootapp.dto.ParkVO;
import com.springbootapp.dto.mapper.ParkMapper;
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
    public void createPark(ParkVO parkVO) {
        parkVO.setStartDate((System.currentTimeMillis() - 7200000) / 1000);
        parkVO.setEndDate(System.currentTimeMillis() / 1000);
        parkRepository.saveAndFlush(parkMapper.VOToEntity(parkVO));
    }
}
