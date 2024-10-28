package com.example.demo.flowers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {

    @Test
    void testAddFunds() {
        PayPalPaymentStrategy payPal = new PayPalPaymentStrategy();
        payPal.addFunds(100.0);
        assertEquals(100.0, payPal.getSum());
    }

    @Test
    void testPay() {
        PayPalPaymentStrategy payPal = new PayPalPaymentStrategy();
        payPal.addFunds(100.0);
        payPal.pay(50.0);
        assertEquals(50.0, payPal.getSum());
    }
}
