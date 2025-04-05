package com.xworkz.inheritance.internal;

public class Bicycle extends Vehicle {
    public Bicycle() {
        super();
        System.out.println("Constructor in Bicycle");
    }

    @Override
    public void startEngine() {
        System.out.println("Vehicle: Engine started. in Bicycle");
    }
    @Override
    public void stopEngine() {
        System.out.println("Vehicle: Engine stopped. in Bicycle");
    }
    @Override
    public void accelerate() {
        System.out.println("Vehicle: Accelerating... in Bicycle");
    }
    @Override
    public void brake() {
        System.out.println("Vehicle: Braking... in Bicycle");
    }
    @Override
    public void honk() {
        System.out.println("Vehicle: Honking... in Bicycle");
    }
}
