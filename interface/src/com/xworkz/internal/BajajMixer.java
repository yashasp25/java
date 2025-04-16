package com.xworkz.internal;

public class BajajMixer implements KitchenAppliance {
    public void turnOn() { System.out.println("Mixer grinding ingredients"); }
    public void turnOff() { System.out.println("Mixer turned off"); }
    public void getStatus() { System.out.println("Mixer is idle"); }
}
