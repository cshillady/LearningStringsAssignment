package com.example.learningstringsagain.practice;

public class Car {
    // Data Methods
    public int vin = 0;
    public int numSeats = 0;
    public int price = 0;
    public String makeAndModel = "";

    // Constructor
    public Car(int vin, int numSeats, int price, String makeAndModel) {
        this.vin = vin;
        this.numSeats = numSeats;
        this.price = price;
        this.makeAndModel = makeAndModel;
    }

    // Accessors
    public void setVin(int vin) {
        this.vin = vin;
    }
    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }
}
