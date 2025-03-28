package com.xworkz.projector;

public class Projector {
    Lens lens;
    Lamp lamp;
    Port port;
    Wire wire;
    Board board;
    Button button;
    Panel panel;
    Remote remote;
    Screw screw;

    Projector() {
        lens = new Lens("Concave", 75);
        lamp = new Lamp(300, "Osram");
        port = new Port("USB-C", 3);
        wire = new Wire("Aluminum", 5);
        board = new Board("Y456", "Panasonic");
        button = new Button("Square", "Volume");
        panel = new Panel(7, "Metal");
        remote = new Remote("LG", 5000);
        screw = new Screw("Phillips", 8);
    }

    void startProjector() {
        System.out.println("Start Projection");
        remote.operate();
        panel.switches();
        port.plug();
        lens.filter();
        board.display();
        wire.numbers();
    }

    public static void main(String[] args) {
        Projector projector = new Projector();
        projector.startProjector();
    }
}
