package com.xworkz.inheritance.internal;

public class Bike extends Vehicle {
    public Bike() {
        super();
        System.out.println("Constructor in Bike");
    }

    @Override
    public void startEngine() {
        System.out.println("Vehicle: Engine started. in Bike");
    }
    @Override
    public void stopEngine() {
        System.out.println("Vehicle: Engine stopped. in Bike");
    }
    @Override
    public void accelerate() {
        System.out.println("Vehicle: Accelerating... in Bike");
    }
    @Override
    public void brake() {
        System.out.println("Vehicle: Braking... in Bike");
    }
    @Override
    public void honk() {
        System.out.println("Vehicle: Honking... in Bike");
    }
}
