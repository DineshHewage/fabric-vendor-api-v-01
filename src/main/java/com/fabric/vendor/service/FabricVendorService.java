package com.fabric.vendor.service;

import com.fabric.vendor.model.FabricVendor;

import java.util.List;

public interface FabricVendorService {
    public String createFabricVendor(FabricVendor fabricVendor);
    public String updateFabricVendor(FabricVendor fabricVendor);
    public String deleteFabricVendor(String vendorId);
    public FabricVendor getFabricVendor(String vendorId);
    public List<FabricVendor> getAllFabricVendors();
}
