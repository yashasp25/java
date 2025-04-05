package com.xworkz.inheritance.internal;

public class Bus extends Vehicle {
    public Bus() {
        super();
        System.out.println("Constructor in Bus");
    }

    @Override
    public void startEngine() {
        System.out.println("Vehicle: Engine started. in Bus");
    }
    @Override
    public void stopEngine() {
        System.out.println("Vehicle: Engine stopped. in Bus");
    }
    @Override
    public void accelerate() {
        System.out.println("Vehicle: Accelerating... in Bus");
    }
    @Override
    public void brake() {
        System.out.println("Vehicle: Braking... in Bus");
    }
    @Override
    public void honk() {
        System.out.println("Vehicle: Honking... in Bus");
    }
}
