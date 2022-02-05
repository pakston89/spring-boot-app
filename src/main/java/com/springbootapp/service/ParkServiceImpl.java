package com.springbootapp.service;

import com.springbootapp.model.Park;
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

    @Override
    public List<Park> getAll() {
        return parkRepository.getAll();
    }

    @Override
    public void savePark(Park park) {
        park.setStartDate((System.currentTimeMillis() - 7200000) / 1000);
        park.setEndDate(System.currentTimeMillis() / 1000);
        parkRepository.save(park);

    }
}
