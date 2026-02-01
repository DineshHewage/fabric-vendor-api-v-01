package com.fabric.vendor.repository;

import com.fabric.vendor.model.FabricVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FabricVendorRepository extends JpaRepository<FabricVendor, String> {
}
