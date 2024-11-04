package com.example.demo.flowers;

public abstract class AbstractDecorator {
    protected Item item;

    public AbstractDecorator(Item item) {
        this.item = item;
    }

    public double getPrice() {
        return item.getPrice();
    }
}
