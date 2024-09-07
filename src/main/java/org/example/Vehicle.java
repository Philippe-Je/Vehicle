package org.example;

//vehicle class
class Vehicle {

    // instance variables for vehicle properties
    private int numberOfWheeels;
    private String color;
    private float engineSize;
    private String fuelType;

    // Default constructor
    public Vehicle() {
        numberOfWheeels = 4;
        color = "White";
        engineSize = 2.0f;
        fuelType = "Regular";
    }

    // Parameterized constructor
    public Vehicle(int numberOfWheeels, String color, float engineSize, String fuelType) {
        this.numberOfWheeels = numberOfWheeels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }

    // Setter methods for vehicle class
    public void setNumberOfWheeels(int numberOfWheeels) {
        this.numberOfWheeels = numberOfWheeels;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    // Getter methods for vehicle class
    public String getFuelType() {
        return fuelType;
    }

    public float getEngineSize() {
        return engineSize;
    }

    public int getNumberOfWheels() {
        return numberOfWheeels;
    }

    public String getColor() {
        return color;
    }
}