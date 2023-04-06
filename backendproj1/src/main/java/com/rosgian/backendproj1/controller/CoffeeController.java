package com.rosgian.backendproj1.controller;

import com.rosgian.backendproj1.DTO.CoffeeDTO;
import com.rosgian.backendproj1.model.CoffeeModel;
import com.rosgian.backendproj1.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coffee")
public class CoffeeController {

    private final CoffeeService coffeeService;

    @Autowired
    public CoffeeController(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }

    @PostMapping
    public CoffeeDTO postCoffee (@RequestBody CoffeeModel coffeeModel) {
        return coffeeService.postCoffee(coffeeModel);
    }
}
