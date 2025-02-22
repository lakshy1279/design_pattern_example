package org.example.Tic_Tac_Toe.flyweight;

// Flyweight Class (Shared properties)
public class Car {
    private final String engine; // ✅ Shared (Intrinsic State)

    public Car(String engine) {
        this.engine = engine;
    }

    public void showDetails(String color) { // ✅ Color is passed as Extrinsic State
        System.out.println("Car Color: " + color + ", Feature: " + engine);
    }
}
