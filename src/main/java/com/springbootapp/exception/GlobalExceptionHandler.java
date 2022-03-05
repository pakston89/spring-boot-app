package com.springbootapp.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @Autowired
    private ErrorMessage errorMessage;

    @ExceptionHandler(value = EmptyResultDataAccessException.class)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ErrorMessage notFoundExceptionHandler(NotFoundException ex) {
        errorMessage.setErrorCode("404");
        errorMessage.setMessage(ex.getMessage() + "eiii");
        return errorMessage;
    }
}
