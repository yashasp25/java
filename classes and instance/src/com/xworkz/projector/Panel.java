package com.xworkz.projector;

public class Panel {
    int numberOfButtons;
    String material;

    Panel(int numberOfButtons, String material) {
        this.numberOfButtons = numberOfButtons;
        this.material = material;
    }

    void switches(){
        System.out.println("Switches present in panel");
        Button button = new Button();
        button.turnON();
    }
}
