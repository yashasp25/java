package com.xworkz.inheritance.internal;

public class Airplane extends Vehicle {
    public Airplane() {
        super();
        System.out.println("Constructor in Airplane");
    }

    @Override
    public void startEngine() {
        System.out.println("Vehicle: Engine started. in Airplane");
    }
    @Override
    public void stopEngine() {
        System.out.println("Vehicle: Engine stopped. in Airplane");
    }
    @Override
    public void accelerate() {
        System.out.println("Vehicle: Accelerating... in Airplane");
    }
    @Override
    public void brake() {
        System.out.println("Vehicle: Braking... in Airplane");
    }
    @Override
    public void honk() {
        System.out.println("Vehicle: Honking... in Airplane");
    }
}
