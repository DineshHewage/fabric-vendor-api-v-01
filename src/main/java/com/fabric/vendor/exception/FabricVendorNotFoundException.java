package com.fabric.vendor.exception;

public class FabricVendorNotFoundException extends RuntimeException {
    public FabricVendorNotFoundException(String meg) {
        super(meg);
    }

    public FabricVendorNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
