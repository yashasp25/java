package com.xworkz.internal;

public class PhilipsHue implements SmartLight {
    public void turnOn() { System.out.println("Philips Hue light turned on"); }
    public void turnOff() { System.out.println("Philips Hue light turned off"); }
    public String getStatus() { System.out.println("Philips Hue is functioning normally"); }
}