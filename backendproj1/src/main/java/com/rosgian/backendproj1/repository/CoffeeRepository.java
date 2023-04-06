package com.rosgian.backendproj1.repository;

import com.rosgian.backendproj1.entity.CoffeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeRepository extends JpaRepository <CoffeeEntity, Long> {
}
