package com.orange.itw.model;

import java.time.LocalDateTime;

public class Discount {

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    private float amount;

    public Discount(LocalDateTime startTime, LocalDateTime endTime, float amount) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.amount = amount;
    }

}
