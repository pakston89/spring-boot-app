package com.springbootapp.service;

import com.springbootapp.model.Park;
import com.springbootapp.repository.ParkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class ParkeServiceImpl implements ParkService {

    @Autowired
    private ParkRepository parkRepository;

    @Override
    public List<Park> getAll() {
        return parkRepository.getAll();
    }

    @Override
    public void savePark(Park park) {
        parkRepository.save(park);

    }
}
