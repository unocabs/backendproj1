package com.rosgian.backendproj1.service;


import com.rosgian.backendproj1.DTO.CoffeeDTO;
import com.rosgian.backendproj1.entity.CoffeeEntity;
import com.rosgian.backendproj1.model.CoffeeModel;
import com.rosgian.backendproj1.repository.CoffeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CoffeeService {

    private final CoffeeRepository coffeeRepository;

    public CoffeeDTO postCoffee(CoffeeModel coffeeModel) {
        coffeeRepository.save(CoffeeEntity.builder()
                .coffeeId(UUID.randomUUID())
                .coffeeName(coffeeModel.getCoffeeName())
                .location(coffeeModel.getLocation())
                .price(coffeeModel.getPrice())
                .build());
         /*CoffeeDTO.builder()
                .coffeeName(coffeeModel.getCoffeeName())
                .location(coffeeModel.getLocation())
                .price(coffeeModel.getPrice())
                .build();*/

        return null;
    }
/*
    public List<BlogDTO> addBlog(BlogRequest newBlog) {

        // Save new blog to database
        blogRepository.save(BlogEntity
                .builder()
                .blogId(UUID.randomUUID())
                .blogName(newBlog.getBlogName())
                .blogAuthor(newBlog.getBlogAuthor())
                .imageLink(null)
                .description(newBlog.getDescription())
                .createdDate(dateTimeUtil.currentDate())
                .modifiedDate(dateTimeUtil.currentDate())
                .build());

        return getAllBlogs();
    }*/

}
