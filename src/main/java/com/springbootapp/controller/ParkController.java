package com.springbootapp.controller;

import com.springbootapp.model.ParkVO;
import com.springbootapp.service.ParkService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Log4j2
@RequestMapping("/park")
public class ParkController {

    @Autowired
    private ParkService parkService;

    @PostMapping
    public void createPark(@RequestBody ParkVO parkVO) {
        log.info("createPark -- Params: " + parkVO.toString());
        parkService.createPark(parkVO);
    }
}
