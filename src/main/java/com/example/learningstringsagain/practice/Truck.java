package com.example.learningstringsagain.practice;

public class Truck extends Car {
    // Data Methods
    private float truckBedLength = 0.0F;
    private int towingCapacity = 0;

    // Constructor
    public Truck(int vin, int numSeats, int price, String makeAndModel, float truckBedLength, int towingCapacity) {
        super(vin, numSeats, price, makeAndModel);
        this.truckBedLength = truckBedLength;
        this.towingCapacity = towingCapacity;
    }

    // Accessors
    public void setTruckBedLength(float truckBedLength) {
        this.truckBedLength = truckBedLength;
    }
    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }
}
