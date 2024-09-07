package org.example;

// Car class extends Vehicle
class Car extends Vehicle {

    // Additional property specific to Car
    private String brand;

    // Default constructor for Car
    public Car() {
        super(); // Call the default constructor of the parent class
        brand = "Toyota";
    }

    // Parameterized constructor for Car
    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType); // Call the parameterized constructor of the parent class
        this.brand = brand;
    }

    // Setter and getter for brand
    public void setbrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    // Method to honk
    void honk() {
        System.out.println("Honk Honk");
    }

    // Method to display car information
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Number of Wheels: " + getNumberOfWheels());
        System.out.println("Color: " + getColor());
        System.out.println("Engine Size: " + getEngineSize());
        System.out.println("Feul type: " + getFuelType());
    }

    // Demonstrating the usage of Vehicle and Car classes
    public static void main(String[] args) {

        // Create instances of Vehicle and Car
        Vehicle myVehicle = new Vehicle();
        Car myCar = new Car();

        // Display Vehicle information
        System.out.println("Vehicle Info:");
        System.out.println("Number of Wheels: " + myVehicle.getNumberOfWheels());
        System.out.println("Color: " + myVehicle.getColor());
        System.out.println("Engine Size: " + myVehicle.getEngineSize());
        System.out.println("Fuel Type: " + myVehicle.getFuelType());

        // Display Car information
        System.out.println("\nCar Info:");
        myCar.honk();
        myCar.displayInfo();

    }
}