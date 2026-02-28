package com.fabric.vendor.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class FabricVendorException {
    private final String message;
    private final Throwable cause;
    private final HttpStatus httpStatus;
}
