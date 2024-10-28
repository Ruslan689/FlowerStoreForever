package com.example.demo.flowers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PayPalPaymentStrategy implements Payment {
    private double sum;

    public void pay(double amount) {
        if (sum >= amount) {
            sum -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void addFunds(double amount) {
        this.sum += amount;
    }
}
