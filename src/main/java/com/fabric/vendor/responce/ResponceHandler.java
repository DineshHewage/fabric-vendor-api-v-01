package com.fabric.vendor.responce;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.HashMap;
import java.util.Map;

public class ResponceHandler {
    public static ResponseEntity<Object> responceBuilder(String message, HttpStatus status, Object body){
        Map<String, Object> responce = new HashMap<>();
        responce.put("message", message);
        responce.put("status", status);
        responce.put("body", body);
        return new ResponseEntity<>(responce, status);
    }
}
