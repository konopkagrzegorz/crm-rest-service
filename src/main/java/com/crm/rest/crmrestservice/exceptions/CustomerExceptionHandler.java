package com.crm.rest.crmrestservice.exceptions;

import javassist.NotFoundException;
import org.hibernate.annotations.NotFound;
import org.hibernate.hql.internal.ast.InvalidPathException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<CustomErrorResponse> handleException (CustomerNotFoundException exception) {
        CustomErrorResponse customErrorResponse = new CustomErrorResponse(HttpStatus.NOT_FOUND.value(),exception.getMessage(),
                System.currentTimeMillis());
        return new ResponseEntity<>(customErrorResponse,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<CustomErrorResponse> handleException (WrongQueryException exception) {
        CustomErrorResponse customErrorResponse = new CustomErrorResponse(HttpStatus.BAD_REQUEST.value(),exception.getMessage(),
                System.currentTimeMillis());
        return new ResponseEntity<>(customErrorResponse,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity<CustomErrorResponse> handleException (Exception exception) {
        CustomErrorResponse customErrorResponse = new CustomErrorResponse(HttpStatus.BAD_REQUEST.value(),"Bad request!",
                System.currentTimeMillis());
        return new ResponseEntity<>(customErrorResponse,HttpStatus.BAD_REQUEST);
    }
}
