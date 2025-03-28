package com.xworkz.projector;

public class Port {
    String type;
    int version;

    Port(String type, int version) {
        this.type = type;
        this.version = version;
    }

    void plug(){
        System.out.println("Plugging projector");
        Wire wire = new Wire();
        wire.numbers();
    }
}
