package com.springbootapp.util;

import com.springbootapp.controller.CustomerRegisterController;
import com.springbootapp.controller.ParkCreateController;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * The logger constants class.
 * @author pause
 */
public class LoggerConstants {

    public static final Log CustomerControllerLog = LogFactory.getLog(CustomerRegisterController.class);
    public static final Log ParkControllerLog = LogFactory.getLog(ParkCreateController.class);
}
