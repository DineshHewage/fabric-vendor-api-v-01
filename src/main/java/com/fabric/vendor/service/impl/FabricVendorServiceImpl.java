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
    public FabricVendor createFabricVendor(FabricVendor fabricVendor) {
        return fabricVendorRepository.save(fabricVendor);
    }

    @Override
    public FabricVendor updateFabricVendor(FabricVendor fabricVendor) {
        return fabricVendorRepository.save(fabricVendor);
    }

    @Override
    public void deleteFabricVendor(String vendorId) {
        fabricVendorRepository.deleteById(vendorId);
    }

    @Override
    public FabricVendor getFabricVendor(String vendorId) {
        return fabricVendorRepository.findById(vendorId)
                .orElseThrow(() -> new FabricVendorNotFoundException("The fabric vendor " + vendorId + " does not exist"));
    }

    @Override
    public List<FabricVendor> getAllFabricVendors() {
        return fabricVendorRepository.findAll();
    }
}
