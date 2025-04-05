package com.xworkz.inheritance.internal;

public class Speaker extends Device {
    public Speaker() {
        super();
        System.out.println("Constructor in Speaker");
    }

    @Override
    public void powerOn() {
        System.out.println("Device: Powering On...in Speaker");
    }
    @Override
    public void powerOff() {
        System.out.println("Device: Powering Off...in Speaker");
    }
    @Override
    public void restart() {
        System.out.println("Device: Restarting...in Speaker");
    }
    @Override
    public void connectToWifi() {
        System.out.println("Device: Connecting to Wi-Fi...in Speaker");
    }
    @Override
    public void displayInfo() {
        System.out.println("Device: Displaying Information...in Speaker");
    }
}
