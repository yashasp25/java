package com.xworkz.projector;

public class Button {
    String shape;
    String function;
    Button(){}

    Button(String shape, String function) {
        this.shape = shape;
        this.function = function;
    }

    void turnON(){
        System.out.println("Turn on projector");
    }

}
