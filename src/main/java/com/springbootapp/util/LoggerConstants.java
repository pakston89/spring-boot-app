package com.springbootapp.util;

import com.springbootapp.controller.CustomerController;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * The logger constants class.
 * @author pause
 */
public class LoggerConstants {

    public static final Log CustomerControllerLog = LogFactory.getLog(CustomerController.class);
    public static final Log ParkingControllerLog = LogFactory.getLog(ParkingControllerLog.class);
}
