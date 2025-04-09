package com.xworkz.inheritance.internal;

public class Vehicle {

    private String color;
    private int wheels;
    private int age;


    public Vehicle(int age,int wheels,String color) {
        this.age=age;
        this.wheels=wheels;
        this.color = color;
        System.out.println("Constructor in Vehicle");
    }

    Vehicle() {
    }

    public void startEngine() {
        System.out.println("Vehicle: Engine started.");
    }

    public void stopEngine() {
        System.out.println("Vehicle: Engine stopped.");
    }

    public void accelerate() {
        System.out.println("Vehicle: Accelerating...");
    }

    public void brake() {
        System.out.println("Vehicle: Braking...");
    }

    public void honk() {
        System.out.println("Vehicle: Honking...");
    }
}