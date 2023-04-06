package com.rosgian.backendproj1.collector;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coffee")
public class CoffeeCollector {

    @GetMapping()
    public String getCoffee() {
        return "Hello World!";
    }

}
