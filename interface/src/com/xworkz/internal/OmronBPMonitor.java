package com.xworkz.internal;

public class OmronBPMonitor implements MedicalDevice {
    public void activate() { System.out.println("Blood Pressure Monitor activated"); }
    public void deactivate() { System.out.println("Blood Pressure Monitor turned off"); }
    public void getStatus() { System.out.println("Reading: 120/80 mmHg"); }
}
