package com.fabric.vendor.service.impl;

import com.fabric.vendor.exception.FabricVendorNotFoundException;
import com.fabric.vendor.model.FabricVendor;
import com.fabric.vendor.repository.FabricVendorRepository;
import com.fabric.vendor.service.FabricVendorService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FabricVendorServiceImpl implements FabricVendorService {

    FabricVendorRepository fabricVendorRepository;

    public FabricVendorServiceImpl(FabricVendorRepository fabricVendorRepository) {
        this.fabricVendorRepository = fabricVendorRepository;
    }

    @Override
    public String createFabricVendor(FabricVendor fabricVendor) {
        fabricVendorRepository.save(fabricVendor);
        return "New Fabric Vendor created successfully";
    }

    @Override
    public String updateFabricVendor(FabricVendor fabricVendor) {
        fabricVendorRepository.save(fabricVendor);
        return "Fabric Vendor updated successfully";
    }

    @Override
    public String deleteFabricVendor(String vendorId) {
        fabricVendorRepository.deleteById(vendorId);
        return "Fabric Vendor deleted successfully";
    }

    @Override
    public FabricVendor getFabricVendor(String vendorId) {
        if(fabricVendorRepository.findById(vendorId).isEmpty())
            throw new FabricVendorNotFoundException("The fabric vendor " + vendorId + " does not exist");
        return fabricVendorRepository.findById(vendorId).get();
    }

    @Override
    public List<FabricVendor> getAllFabricVendors() {
        return fabricVendorRepository.findAll();
    }
}
