package com.example.learningstringsagain.practice;

import java.lang.reflect.Array;

public class RaceCar extends Car {
    // Data Methods
    private String driverName = "";
    private float topSpeed = 0.0F;
    private String primarySponsor = "";

    // Constructor
    public RaceCar(int vin, int numSeats, int price, String makeAndModel, String driverName, float topSpeed, String primarySponsor) {
        super(vin, numSeats, price, makeAndModel);
        this.driverName = driverName;
        this.topSpeed = topSpeed;
        this.primarySponsor = primarySponsor;
    }

    // Accessors
    public String getDriverName() {
        return driverName;
    }
    public float getTopSpeed() {
        return topSpeed;
    }
    public String getPrimarySponsor() {
        return primarySponsor;
    }
}
