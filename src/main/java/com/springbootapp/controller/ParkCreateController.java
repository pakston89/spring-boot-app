package com.springbootapp.controller;

import com.springbootapp.dto.ParkDto;
import com.springbootapp.service.ParkCreateService;
import com.springbootapp.util.LoggerConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * The Park create controller class.
 * @author pause
 */
@RestController
@RequestMapping("/parks")
public class ParkCreateController {

    @Autowired
    private ParkCreateService parkCreateService;

    @PostMapping("/park")
    public void createPark(@RequestBody ParkDto parkDto) {
        LoggerConstants.ParkControllerLog.info("createPark -- Params: " + parkDto.toString());
        parkCreateService.createPark(parkDto);
    }
}
