package com.xworkz.projector;

public class Screw {
    String type;
    int size;

    Screw(String type, int size) {
        this.type = type;
        this.size = size;
    }
    Screw(){}
    void hold(){
        System.out.println("Hold using screw");
    }
}
