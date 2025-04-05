package com.xworkz.inheritance.internal;

public class Helicopter extends Vehicle {
    public Helicopter() {
        super();
        System.out.println("Constructor in Helicopter");
    }

    @Override
    public void startEngine() {
        System.out.println("Vehicle: Engine started. in Helicopter");
    }
    @Override
    public void stopEngine() {
        System.out.println("Vehicle: Engine stopped. in Helicopter");
    }
    @Override
    public void accelerate() {
        System.out.println("Vehicle: Accelerating... in Helicopter");
    }
    @Override
    public void brake() {
        System.out.println("Vehicle: Braking... in Helicopter");
    }
    @Override
    public void honk() {
        System.out.println("Vehicle: Honking... in Helicopter");
    }
}
