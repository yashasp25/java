package com.xworkz.inheritance.internal;

public class Tiger extends Animal {
    public Tiger() {
        super();
        System.out.println("Constructor in Tiger");
    }
    @Override
    public void eat() {
        System.out.println("Animal: Eating...in Tiger");
    }
    @Override
    public void sleep() {
        System.out.println("Animal: Sleeping...in Tiger");
    }
    @Override
    public void makeSound() {
        System.out.println("Animal: Making sound...in Tiger");
    }
    @Override
    public void move() {
        System.out.println("Animal: Moving...in Tiger");
    }
    @Override
    public void breathe() {
        System.out.println("Animal: Breathing...in Tiger");
    }
}
