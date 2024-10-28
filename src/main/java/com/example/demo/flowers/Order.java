package com.example.demo.flowers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private String nickname;
    private double amount;

    public void applyDiscount(double discount) {
        this.amount -= discount;
    }
}
