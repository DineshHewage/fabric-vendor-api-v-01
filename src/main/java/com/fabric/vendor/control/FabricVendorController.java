package com.fabric.vendor.control;

import com.fabric.vendor.model.FabricVendor;
import com.fabric.vendor.service.FabricVendorService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/mill")
public class FabricVendorController {
    FabricVendorService fabricVendorService;

    public FabricVendorController(FabricVendorService fabricVendorService) {
        this.fabricVendorService = fabricVendorService;
    }

    @PostMapping
    public String createFabricVendor(@RequestBody FabricVendor fabricVendor) {
        return fabricVendorService.createFabricVendor (fabricVendor);
    }

    @PutMapping
    public String updateFabricVendor(@RequestBody FabricVendor fabricVendor) {
        return fabricVendorService.updateFabricVendor(fabricVendor);
    }

    @DeleteMapping("{id}")
    public String deleteFabricVendor(@PathVariable String id) {
        return fabricVendorService.deleteFabricVendor(id);
    }

//     retrieve only one fabric vendor
    @GetMapping("{id}")
    public FabricVendor getFabricVendor(@PathVariable String id) {
        return fabricVendorService.getFabricVendor(id);
    }

//     retrieve all fabric vendor
    @GetMapping
    public List<FabricVendor> listFabricVendor() {
        return fabricVendorService.getAllFabricVendors();
    }
}
