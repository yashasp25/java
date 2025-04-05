package com.xworkz.inheritance.internal;

public class Dolphin extends Animal {
    public Dolphin() {
        super();
        System.out.println("Constructor in Dolphin");
    }
    @Override
    public void eat() {
        System.out.println("Animal: Eating...in Dolphin");
    }
    @Override
    public void sleep() {
        System.out.println("Animal: Sleeping...in Dolphin");
    }
    @Override
    public void makeSound() {
        System.out.println("Animal: Making sound...in Dolphin");
    }
    @Override
    public void move() {
        System.out.println("Animal: Moving...in Dolphin");
    }
    @Override
    public void breathe() {
        System.out.println("Animal: Breathing...in Dolphin");
    }
}
