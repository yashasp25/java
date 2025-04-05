package com.xworkz.inheritance.internal;

public class Printer extends Device {
    public Printer() {
        super();
        System.out.println("Constructor in Printer");
    }

    @Override
    public void powerOn() {
        System.out.println("Device: Powering On...in Printer");
    }
    @Override
    public void powerOff() {
        System.out.println("Device: Powering Off...in Printer");
    }
    @Override
    public void restart() {
        System.out.println("Device: Restarting...in Printer");
    }
    @Override
    public void connectToWifi() {
        System.out.println("Device: Connecting to Wi-Fi...in Printer");
    }
    @Override
    public void displayInfo() {
        System.out.println("Device: Displaying Information...in Printer");
    }
}
