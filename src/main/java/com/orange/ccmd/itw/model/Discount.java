package com.orange.ccmd.itw.model;

import java.time.OffsetDateTime;

public class Discount {

    public final OffsetDateTime startTime;
    public final OffsetDateTime endTime;

    public final float amount;

    public Discount(OffsetDateTime startTime, OffsetDateTime endTime, float amount) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.amount = amount;
    }

}
