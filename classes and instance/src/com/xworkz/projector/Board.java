package com.xworkz.projector;

public class Board {
    String model;
    String manufacturer;

    Board(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
    public void display(){
        System.out.println("Displaying on board");
        Screw screw = new Screw();
        screw.hold();
    }
}
