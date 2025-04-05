package com.xworkz.inheritance.internal;

public class Boat extends Vehicle {
    public Boat() {
        super();
        System.out.println("Constructor in Boat");
    }

    @Override
    public void startEngine() {
        System.out.println("Vehicle: Engine started. in Boat");
    }
    @Override
    public void stopEngine() {
        System.out.println("Vehicle: Engine stopped. in Boat");
    }
    @Override
    public void accelerate() {
        System.out.println("Vehicle: Accelerating... in Boat");
    }
    @Override
    public void brake() {
        System.out.println("Vehicle: Braking... in Boat");
    }
    @Override
    public void honk() {
        System.out.println("Vehicle: Honking... in Boat");
    }
}
