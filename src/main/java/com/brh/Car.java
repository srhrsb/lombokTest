package com.brh;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
    private String name;
    private int speed;
    private int price;
    private int weight;
}
