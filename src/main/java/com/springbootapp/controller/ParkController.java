package com.springbootapp.controller;

import com.springbootapp.dto.ParkVO;
import com.springbootapp.service.ParkService;
import com.springbootapp.util.LoggerConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * The Park create controller class.
 * @author pause
 */
@RestController
@RequestMapping("/park")
public class ParkController {

    @Autowired
    private ParkService parkService;

    @PostMapping
    public void createPark(@RequestBody ParkVO parkVO) {
        LoggerConstants.ParkControllerLog.info("createPark -- Params: " + parkVO.toString());
        parkService.createPark(parkVO);
    }
}
