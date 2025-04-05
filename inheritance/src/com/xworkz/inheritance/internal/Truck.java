package com.xworkz.inheritance.internal;

public class Truck extends Vehicle {
    public Truck() {
        super();
        System.out.println("Constructor in Truck");
    }

    @Override
    public void startEngine() {
        System.out.println("Vehicle: Engine started. in Truck");
    }
    @Override
    public void stopEngine() {
        System.out.println("Vehicle: Engine stopped. in Truck");
    }
    @Override
    public void accelerate() {
        System.out.println("Vehicle: Accelerating... in Truck");
    }
    @Override
    public void brake() {
        System.out.println("Vehicle: Braking... in Truck");
    }
    @Override
    public void honk() {
        System.out.println("Vehicle: Honking... in Truck");
    }
}
