package com.springbootapp.service;

import com.springbootapp.dto.ParkDto;
import java.util.List;

/**
 * The Park service interface.
 * @author pause
 */
public interface ParkService {

    public List<ParkDto> getAllParks();

    public void savePark(ParkDto parkDto);
}
