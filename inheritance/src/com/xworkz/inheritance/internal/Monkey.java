package com.xworkz.inheritance.internal;

public class Monkey extends Animal {
    public Monkey() {
        super();
        System.out.println("Constructor in Monkey");
    }
    @Override
    public void eat() {
        System.out.println("Animal: Eating...in Monkey");
    }
    @Override
    public void sleep() {
        System.out.println("Animal: Sleeping...in Monkey");
    }
    @Override
    public void makeSound() {
        System.out.println("Animal: Making sound...in Monkey");
    }
    @Override
    public void move() {
        System.out.println("Animal: Moving...in Monkey");
    }
    @Override
    public void breathe() {
        System.out.println("Animal: Breathing...in Monkey");
    }
}
