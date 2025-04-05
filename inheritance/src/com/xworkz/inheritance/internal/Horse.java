package com.xworkz.inheritance.internal;

public class Horse extends Animal {
    public Horse() {
        super();
        System.out.println("Constructor in Horse");
    }

    @Override
    public void eat() {
        System.out.println("Animal: Eating...in Horse");
    }
    @Override
    public void sleep() {
        System.out.println("Animal: Sleeping...in Horse");
    }
    @Override
    public void makeSound() {
        System.out.println("Animal: Making sound...in Horse");
    }
    @Override
    public void move() {
        System.out.println("Animal: Moving...in Horse");
    }
    @Override
    public void breathe() {
        System.out.println("Animal: Breathing...in Horse");
    }
}
