package com.example.demo.flowers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {

    @Test
    void testUpdateStatus() {
        DHLDeliveryStrategy dhl = new DHLDeliveryStrategy();
        dhl.updateStatus(true);
        assertTrue(dhl.isStatus());
    }
}
