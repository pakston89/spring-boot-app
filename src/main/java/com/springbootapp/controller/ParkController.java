package com.springbootapp.controller;

import com.springbootapp.dto.ParkDto;
import com.springbootapp.dto.ParkMapper;
import com.springbootapp.service.ParkService;
import com.springbootapp.util.LoggerConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * The Park controller class.
 * @author pause
 */
@RestController
@RequestMapping("/parks")
public class ParkController {

    @Autowired
    private ParkService parkService;

    @Autowired
    private ParkMapper parkMapper;

    @GetMapping("/allparks")
    public List<ParkDto> getAllParks() {
        LoggerConstants.ParkControllerLog.info("getAllParks -- Params: " + "none");
        return parkService.getAllParks();
    }

    @PostMapping("/park")
    public void savePark(@RequestBody ParkDto parkDto) {
        LoggerConstants.ParkControllerLog.info("savePark -- Params: " + parkDto.toString());
        parkService.savePark(parkDto);
    }
}
