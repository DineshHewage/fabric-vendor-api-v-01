package com.fabric.vendor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "fabric_vendor_info")
public class FabricVendor {
    @Id
    private String id;
    private String name;
    private String email;
    private String fabricType;
    private Integer leadTime;
//    private Integer leadTime;  - Can be null
//    private int leadTime;      - Cannot be null, defaults to 0
}
