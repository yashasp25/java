package com.xworkz.projector;

public class Remote {
    String brand;
    int cell;

    Remote(String brand, int cell) {
        this.brand = brand;
        this.cell = cell;
    }

    void operate(){
        System.out.println("Use projector using remote");
        Button button = new Button();
        button.turnON();
    }
}
