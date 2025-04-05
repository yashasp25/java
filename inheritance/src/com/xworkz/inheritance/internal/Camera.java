package com.xworkz.inheritance.internal;

public class Camera extends Device {
    public Camera() {
        super();
        System.out.println("Constructor in Camera");
    }

    @Override
    public void powerOn() {
        System.out.println("Device: Powering On...in Cam");
    }
    @Override
    public void powerOff() {
        System.out.println("Device: Powering Off...in Cam");
    }
    @Override
    public void restart() {
        System.out.println("Device: Restarting...in Cam");
    }
    @Override
    public void connectToWifi() {
        System.out.println("Device: Connecting to Wi-Fi...in Cam");
    }
    @Override
    public void displayInfo() {
        System.out.println("Device: Displaying Information...in Cam");
    }
}
