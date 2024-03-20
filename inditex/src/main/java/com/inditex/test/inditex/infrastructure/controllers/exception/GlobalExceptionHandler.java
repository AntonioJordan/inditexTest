package com.inditex.test.inditex.infrastructure.controllers.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handlePriceNotFoundException(IllegalArgumentException exception) {
        return ResponseEntity.notFound().build();
    }
}