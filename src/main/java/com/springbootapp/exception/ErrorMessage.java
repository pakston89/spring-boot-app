package com.springbootapp.exception;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ErrorMessage {

    private String errorCode;

    private String message;
}
