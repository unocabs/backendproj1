package com.rosgian.backendproj1.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CoffeeModel {

    private String coffeeName;
    private String location;
    private Integer price;
}
