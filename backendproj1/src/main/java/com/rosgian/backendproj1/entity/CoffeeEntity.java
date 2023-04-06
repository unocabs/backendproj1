package com.rosgian.backendproj1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@ToString
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "rosgian", name = "coffee")
public class CoffeeEntity {

    @Id
    private UUID coffeeId;
    private String coffeeName;
    private String location;
    private Integer price;
}
