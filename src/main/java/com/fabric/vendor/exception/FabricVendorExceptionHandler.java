package com.fabric.vendor.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class FabricVendorExceptionHandler {
    @ExceptionHandler(value = {FabricVendorNotFoundException.class})

    public ResponseEntity<Object> handleFabricVendorNotFoundException(FabricVendorNotFoundException fabricVendorNotFoundException) {
        FabricVendorException fabricVendorException = new FabricVendorException(
                fabricVendorNotFoundException.getMessage(),
                fabricVendorNotFoundException.getCause(),
                HttpStatus.NOT_FOUND
                );
        return new ResponseEntity<>(fabricVendorException, HttpStatus.NOT_FOUND);
    }
}
