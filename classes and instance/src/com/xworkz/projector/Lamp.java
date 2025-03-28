package com.xworkz.projector;

public class Lamp {
    int wattage;
    String brand;

    Lamp(int wattage, String brand) {
        this.wattage = wattage;
        this.brand = brand;
    }

    void flash(){
        System.out.println("Use lamp to ");
        Button button=new Button();
        button.turnON();
    }
}
