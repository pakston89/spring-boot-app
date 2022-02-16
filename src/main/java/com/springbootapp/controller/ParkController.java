package com.springbootapp.controller;

import com.springbootapp.dto.ParkDto;
import com.springbootapp.model.Park;
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

    @GetMapping("/allparks")
    public List<ParkDto> getAllParks() {
        LoggerConstants.ParkControllerLog.info("getAllParks -- Params: " + "none");
        return parkService.getAllParks();
    }

    @GetMapping("/parksbycustomeridp")
    public List<ParkDto> getParksByCustomerIdp(Long customerIdp) {
        LoggerConstants.ParkControllerLog.info("getParksByCustomerIdp -- Params: " + "customerIdp");
        return parkService.getParksByCustomerIdp(customerIdp);
    }

    @PostMapping("/park")
    public void savePark(@RequestBody ParkDto parkDto) {
        LoggerConstants.ParkControllerLog.info("savePark -- Params: " + parkDto.toString());
        parkService.savePark(parkDto);
    }
}
