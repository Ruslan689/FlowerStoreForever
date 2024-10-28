package com.example.demo.flowers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    private String type;
    private double price;

    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }
}
