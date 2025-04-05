package com.xworkz.inheritance.internal;

public class Eagle extends Animal {
    public Eagle() {
        super();
        System.out.println("Constructor in Eagle");
    }
    @Override
    public void eat() {
        System.out.println("Animal: Eating...in Eagle");
    }
    @Override
    public void sleep() {
        System.out.println("Animal: Sleeping...in Eagle");
    }
    @Override
    public void makeSound() {
        System.out.println("Animal: Making sound...in Eagle");
    }
    @Override
    public void move() {
        System.out.println("Animal: Moving...in Eagle");
    }
    @Override
    public void breathe() {
        System.out.println("Animal: Breathing...in Eagle");
    }
}
