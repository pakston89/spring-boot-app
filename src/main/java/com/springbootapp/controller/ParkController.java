package com.springbootapp.controller;

import com.springbootapp.dto.ParkGetDto;
import com.springbootapp.dto.ParkMapper;
import com.springbootapp.dto.ParkPostDto;
import com.springbootapp.service.ParkService;
import com.springbootapp.util.LoggerConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * The Park controller class.
 * @author pause
 */
@RestController
@RequestMapping("/park")
public class ParkController {

    @Autowired
    private ParkService parkService;

    @Autowired
    private ParkMapper parkMapper;

    @GetMapping("/getAllParks")
    public List<ParkGetDto> getAll() {
        LoggerConstants.ParkControllerLog.info("getAllParks -- Params: " + "none");
        return parkMapper.parksToParksGetDto(parkService.getAll());
    }

    @PostMapping("/savePark")
    public void savePark(ParkPostDto parkPostDto) {
        LoggerConstants.ParkControllerLog.info("savePark -- Params: " + parkPostDto.toString());
        parkService.savePark(parkMapper.parkPostDtoToPark(parkPostDto));
    }
}
