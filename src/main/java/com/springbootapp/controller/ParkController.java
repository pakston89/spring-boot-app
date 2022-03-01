package com.springbootapp.controller;

import com.springbootapp.model.ParkVO;
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
    public void createPark(@RequestBody ParkVO parkVO) {
        Logger.LOGGER.info("createPark -- Params: " + parkVO.toString());
        parkService.createPark(parkVO);
    }
}
