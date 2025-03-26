package com.xworkz.staticvariables;

public class Shirt {
    public static int buttons;

    public String color;

    public Shirt (){
        System.out.println("Object created");
    }

    static {
        buttons = 7;
        System.out.println("Static block called");
    }
}
