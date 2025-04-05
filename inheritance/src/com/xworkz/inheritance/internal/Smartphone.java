package com.xworkz.inheritance.internal;

public class Smartphone extends Device {
    public Smartphone() {
        super();
        System.out.println("Constructor in Smartphone");
    }

    @Override
    public void powerOn() {
        System.out.println("Device: Powering On...in Smartphone");
    }
    @Override
    public void powerOff() {
        System.out.println("Device: Powering Off...in Smartphone");
    }
    @Override
    public void restart() {
        System.out.println("Device: Restarting...in Smartphone");
    }
    @Override
    public void connectToWifi() {
        System.out.println("Device: Connecting to Wi-Fi...in Smartphone");
    }
    @Override
    public void displayInfo() {
        System.out.println("Device: Displaying Information...in Smartphone");
    }
}
