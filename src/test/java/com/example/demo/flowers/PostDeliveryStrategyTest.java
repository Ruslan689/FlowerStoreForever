package com.example.demo.flowers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PostDeliveryStrategyTest {

    @Test
    void testUpdateStatus() {
        PostDeliveryStrategy post = new PostDeliveryStrategy();
        post.updateStatus(true);
        assertTrue(post.isStatus());
    }
}
