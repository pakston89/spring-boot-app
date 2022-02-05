package com.springbootapp.service;

import com.springbootapp.model.Park;
import java.util.List;

public interface ParkService {

    public List<Park> getAll();

    public void savePark(Park park);
}
