package com.example.demo.flowers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DHLDeliveryStrategy implements Delivery {
    private boolean status;

    public void updateStatus(boolean newStatus) {
        this.status = newStatus;
    }
}
