package com.springbootapp.controller;

import com.springbootapp.model.ParkDTO;
import com.springbootapp.service.ParkService;
import com.springbootapp.util.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/park")
public class ParkController {

    @Autowired
    private ParkService parkService;

    @PostMapping
    public void createPark(@RequestBody ParkDTO parkDTO) {
        Logger.LOGGER.info("createPark -- Params: " + parkDTO.toString());
        parkService.createPark(parkDTO);
    }
}
