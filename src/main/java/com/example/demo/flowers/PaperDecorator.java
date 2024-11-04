package com.example.demo.flowers;

public class PaperDecorator extends AbstractDecorator {
    
    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 13;
    }

    // @Override
    // public String getDescription() {
    //     return item.getDescription() + ", with Paper";
    // }
}
