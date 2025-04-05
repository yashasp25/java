package com.xworkz.inheritance.internal;

public class Ship extends Vehicle {
    public Ship() {
        super();
        System.out.println("Constructor in Ship");
    }

    @Override
    public void startEngine() {
        System.out.println("Vehicle: Engine started. in Ship");
    }
    @Override
    public void stopEngine() {
        System.out.println("Vehicle: Engine stopped. in Ship");
    }
    @Override
    public void accelerate() {
        System.out.println("Vehicle: Accelerating... in Ship");
    }
    @Override
    public void brake() {
        System.out.println("Vehicle: Braking... in Ship");
    }
    @Override
    public void honk() {
        System.out.println("Vehicle: Honking... in Ship");
    }
}
