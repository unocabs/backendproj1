package com.rosgian.backendproj1.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CoffeeDTO {

    private String coffeeName;
    private String location;
    private Integer price;
}
