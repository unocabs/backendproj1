package com.rosgian.backendproj1.service;


import com.rosgian.backendproj1.DTO.CoffeeDTO;
import com.rosgian.backendproj1.model.CoffeeModel;
import org.springframework.stereotype.Service;

@Service
public class CoffeeService {

    public CoffeeDTO postCoffee(CoffeeModel coffeeModel) {
        return CoffeeDTO.builder()
                .coffeeName(coffeeModel.getCoffeeName())
                .location(coffeeModel.getLocation())
                .price(coffeeModel.getPrice())
                .build();
    }
}
