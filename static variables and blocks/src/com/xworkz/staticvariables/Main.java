package com.xworkz.staticvariables;

public class Main {
    public static void main(String[] args) {
        Shirt shirt = new Shirt();
        shirt.color = "Blue";
        System.out.println("Shirt  ...");
        System.out.println("Buttons : "+Shirt.buttons+ ", Color : "+shirt.color);

    }
}
