package com.xworkz.inheritance.internal;

public class Laptop extends Device {
    public Laptop() {
        super();
        System.out.println("Constructor in Laptop");
    }

    @Override
    public void powerOn() {
        System.out.println("Device: Powering On...in Laptop");
    }
    @Override
    public void powerOff() {
        System.out.println("Device: Powering Off...in Laptop");
    }
    @Override
    public void restart() {
        System.out.println("Device: Restarting...in Laptop");
    }
    @Override
    public void connectToWifi() {
        System.out.println("Device: Connecting to Wi-Fi...in Laptop");
    }
    @Override
    public void displayInfo() {
        System.out.println("Device: Displaying Information...in Laptop");
    }
}
