package com.example.demo.flowers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentStrategyTest {

    @Test
    void testAddFunds() {
        CreditCardPaymentStrategy creditCard = new CreditCardPaymentStrategy();
        creditCard.addFunds(100.0);
        assertEquals(100.0, creditCard.getSum());
    }

    @Test
    void testPay() {
        CreditCardPaymentStrategy creditCard = new CreditCardPaymentStrategy();
        creditCard.addFunds(100.0);
        creditCard.pay(50.0);
        assertEquals(50.0, creditCard.getSum());
    }
}
