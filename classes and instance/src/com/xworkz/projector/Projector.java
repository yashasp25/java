package com.xworkz.projector;

public class Projector {

    void startProjector() {
        System.out.println("Start Projection");
        lamp.turnOn();
        button.press();
    }

    public static void main(String[] args) {
        Projector projector = new Projector();
        projector.startProjector();
    }
}
