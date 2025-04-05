package com.xworkz.inheritance.internal;

public class Smartwatch extends Device {
    public Smartwatch() {
        super();
        System.out.println("Constructor in Smartwatch");
    }

    @Override
    public void powerOn() {
        System.out.println("Device: Powering On...in Smartwatch");
    }
    @Override
    public void powerOff() {
        System.out.println("Device: Powering Off...in Smartwatch");
    }
    @Override
    public void restart() {
        System.out.println("Device: Restarting...in Smartwatch");
    }
    @Override
    public void connectToWifi() {
        System.out.println("Device: Connecting to Wi-Fi...in Smartwatch");
    }
    @Override
    public void displayInfo() {
        System.out.println("Device: Displaying Information...in Smartwatch");
    }
}
