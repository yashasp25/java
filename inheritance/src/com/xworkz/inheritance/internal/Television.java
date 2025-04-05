package com.xworkz.inheritance.internal;

public class Television extends Device {
    public Television() {
        super();
        System.out.println("Constructor in Television");
    }

    @Override
    public void powerOn() {
        System.out.println("Device: Powering On...in TV");
    }
    @Override
    public void powerOff() {
        System.out.println("Device: Powering Off...in TV");
    }
    @Override
    public void restart() {
        System.out.println("Device: Restarting...in TV");
    }
    @Override
    public void connectToWifi() {
        System.out.println("Device: Connecting to Wi-Fi...in TV");
    }
    @Override
    public void displayInfo() {
        System.out.println("Device: Displaying Information...in TV");
    }
}
