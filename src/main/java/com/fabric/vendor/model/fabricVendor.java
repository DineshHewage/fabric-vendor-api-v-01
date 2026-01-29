package com.fabric.vendor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class fabricVendor {
    @Id
    private String id;
    private String name;
    private String email;
    private String fabricType;
    private Integer leadTime;
//    private Integer leadTime;  - Can be null
//    private int leadTime;      - Cannot be null, defaults to 0
}
