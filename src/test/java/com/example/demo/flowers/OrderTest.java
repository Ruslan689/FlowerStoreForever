package com.example.demo.flowers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void testApplyDiscount() {
        Order order = new Order();
        order.setAmount(100.0);
        order.applyDiscount(10.0);
        assertEquals(90.0, order.getAmount());
    }
}
