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
    private Integer leadTimeInDays;
//    private Integer leadTime;  - Can be null
//    private int leadTime;      - Cannot be null, defaults to 0

/*   leadTimeInDays - This is a technical word related to the apparel industry and it
    the time take to come fabric to your location from the fabric mill(Where fabric are manufactured)
    */
}
