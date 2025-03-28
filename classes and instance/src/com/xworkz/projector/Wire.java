package com.xworkz.projector;

public class Wire {
    String material;
    int length;

    Wire(){}
    Wire(String material, int length) {
        this.material = material;
        this.length = length;
    }
    void numbers(){
        System.out.println("Type and number of wires used");
    }
}
