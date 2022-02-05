package com.springbootapp.service;

import com.springbootapp.model.Park;
import java.util.List;

/**
 * The Park service interface.
 * @author pause
 */
public interface ParkService {

    public List<Park> getAll();

    public void savePark(Park park);
}
