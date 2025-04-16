package com.xworkz.internal;

public class Tesla implements Vehicle {
    public void start() { System.out.println("Tesla Model 3 started"); }
    public void stop() { System.out.println("Tesla Model 3 stopped"); }
    public void getStatus() { System.out.println("Tesla battery at 80%"); }
}
