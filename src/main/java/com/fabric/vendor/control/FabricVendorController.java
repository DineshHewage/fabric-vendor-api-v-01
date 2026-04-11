package com.fabric.vendor.control;

import com.fabric.vendor.model.FabricVendor;
import com.fabric.vendor.responce.ResponceHandler;
import com.fabric.vendor.service.FabricVendorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mill")
public class FabricVendorController {
    FabricVendorService fabricVendorService;

    public FabricVendorController(FabricVendorService fabricVendorService) {
        this.fabricVendorService = fabricVendorService;
    }

    @PostMapping
    public ResponseEntity<Object> createFabricVendor(@RequestBody FabricVendor fabricVendor) {
        return ResponceHandler.responceBuilder("Fabric Vendor " + fabricVendor.getName() + " was created successfully",
                HttpStatus.CREATED,
                fabricVendorService.createFabricVendor (fabricVendor));
    }

    @PutMapping
    public ResponseEntity<Object> updateFabricVendor(@RequestBody FabricVendor fabricVendor) {
        return ResponceHandler.responceBuilder("Fabric vendor " + fabricVendor.getName() + " was updated successfully",
                HttpStatus.OK,
                fabricVendorService.updateFabricVendor(fabricVendor));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> deleteFabricVendor(@PathVariable String id) {
        fabricVendorService.deleteFabricVendor(id);
        return ResponceHandler.responceBuilder("Fabric vendor with id " + id + " was deleted successfully",
                HttpStatus.OK,
                null);
    }

//     retrieve only one fabric vendor
    @GetMapping("{id}")
    public ResponseEntity<Object> getFabricVendor(@PathVariable String id) {
        return ResponceHandler.responceBuilder("Requested fabric vendor details are given here",
                HttpStatus.OK,
                fabricVendorService.getFabricVendor(id));
    }

//     retrieve all fabric vendor
    @GetMapping
    public ResponseEntity<Object> listFabricVendor() {
        return ResponceHandler.responceBuilder("Requested all fabric vendor details are given here",
                HttpStatus.OK,
                fabricVendorService.getAllFabricVendors());
    }
}
