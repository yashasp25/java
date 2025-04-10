package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.internal.Car;
import com.xworkz.inheritance.internal.Vehicle;

public class CarRunner {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(70,4,"BLue");
        System.out.println("Vehicle : "+vehicle.toString());
        vehicle.brake();
        vehicle.accelerate();
        vehicle.startEngine();

        Car car = new Car();
        car.honk();
        car.stopEngine();
    }
}
