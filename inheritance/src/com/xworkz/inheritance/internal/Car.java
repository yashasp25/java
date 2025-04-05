package com.xworkz.inheritance.internal;

public class Car extends Vehicle {
    public Car(){
        super();
        System.out.println("Constructor in Car");
    }

    @Override
    public void startEngine() {
        System.out.println("Vehicle: Engine started. in Car");
    }
    @Override
    public void stopEngine() {
        System.out.println("Vehicle: Engine stopped. in Car");
    }
    @Override
    public void accelerate() {
        System.out.println("Vehicle: Accelerating... in Car");
    }
    @Override
    public void brake() {
        System.out.println("Vehicle: Braking... in Car");
    }
    @Override
    public void honk() {
        System.out.println("Vehicle: Honking... in Car");
    }
}
