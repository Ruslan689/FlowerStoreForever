package com.example.demo.flowers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void testUpdatePrice() {
        Item item = new Item();
        item.updatePrice(20.0);
        assertEquals(20.0, item.getPrice());
    }
}
