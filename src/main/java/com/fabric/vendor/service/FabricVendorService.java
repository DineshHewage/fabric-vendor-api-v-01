package com.fabric.vendor.service;

import com.fabric.vendor.model.FabricVendor;
import java.util.List;

public interface FabricVendorService {
    public FabricVendor createFabricVendor(FabricVendor fabricVendor);
    public FabricVendor updateFabricVendor(FabricVendor fabricVendor);
    public void deleteFabricVendor(String vendorId);
    public FabricVendor getFabricVendor(String vendorId);
    public List<FabricVendor> getAllFabricVendors();
}
