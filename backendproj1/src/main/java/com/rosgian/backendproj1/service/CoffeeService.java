package com.rosgian.backendproj1.service;


import com.rosgian.backendproj1.DTO.CoffeeDTO;
import com.rosgian.backendproj1.entity.CoffeeEntity;
import com.rosgian.backendproj1.model.CoffeeModel;
import com.rosgian.backendproj1.repository.CoffeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CoffeeService {

    private final CoffeeRepository coffeeRepository;

    public List<CoffeeDTO> getAllCoffee() {
        List<CoffeeEntity> coffeeEntities = coffeeRepository.findAll();
        List<CoffeeDTO> coffeeDTOList = new ArrayList<>();

        /*for loop*/
        coffeeEntities.forEach(coffeeEntity -> coffeeDTOList.add(CoffeeDTO.builder()
                        .coffeeName(coffeeEntity.getCoffeeName())
                        .location(coffeeEntity.getLocation())
                        .price(coffeeEntity.getPrice())
                        .build()));

        return coffeeDTOList;
    }

    public List<CoffeeDTO> postCoffee(CoffeeModel coffeeModel) {
        coffeeRepository.save(CoffeeEntity.builder()
                .coffeeId(UUID.randomUUID())
                .coffeeName(coffeeModel.getCoffeeName())
                .location(coffeeModel.getLocation())
                .price(coffeeModel.getPrice())
                .build());

        return getAllCoffee();
    }

}
