package com.xworkz.inheritance.internal;

public class Tablet extends Device {
    public Tablet() {
        super();
        System.out.println("Constructor in Tablet");
    }

    @Override
    public void powerOn() {
        System.out.println("Device: Powering On...in Tablet");
    }
    @Override
    public void powerOff() {
        System.out.println("Device: Powering Off...in Tablet");
    }
    @Override
    public void restart() {
        System.out.println("Device: Restarting...in Tablet");
    }
    @Override
    public void connectToWifi() {
        System.out.println("Device: Connecting to Wi-Fi...in Tablet");
    }
    @Override
    public void displayInfo() {
        System.out.println("Device: Displaying Information...in Tablet");
    }
}
