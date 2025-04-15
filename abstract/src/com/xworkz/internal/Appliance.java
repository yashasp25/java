package com.xworkz.internal;

public abstract class Appliance {
    abstract void turnOn();

    void plugIn() {
        System.out.println("Appliance is plugged in.");
    }
}
