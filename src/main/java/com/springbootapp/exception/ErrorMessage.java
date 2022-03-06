package com.springbootapp.exception;

import org.springframework.stereotype.Component;

public class ErrorMessage {

    private String statusCode;

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
}
