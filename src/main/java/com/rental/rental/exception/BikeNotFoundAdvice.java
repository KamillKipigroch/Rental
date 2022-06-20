package com.rental.rental.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class BikeNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(BikeNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String bikeNotFoundGHandler(BikeNotFoundException ex){
        return ex.getMessage();
    }
}
