package com.xworkz.projector;

public class Lens {
    String type;
    int focalLength;

    Lens(String type, int focalLength) {
        this.type = type;
        this.focalLength = focalLength;
    }

    void filter(){
        System.out.println("Activated lens");
    }
}
