package com.xworkz.inheritance.internal;

public class Cat extends Animal {
    public Cat() {
        super();
        System.out.println("Constructor in Cat");
    }

    @Override
    public void eat() {
        System.out.println("Animal: Eating...in Cat");
    }
    @Override
    public void sleep() {
        System.out.println("Animal: Sleeping...in Cat");
    }
    @Override
    public void makeSound() {
        System.out.println("Animal: Making sound...in Cat");
    }
    @Override
    public void move() {
        System.out.println("Animal: Moving...in Cat");
    }
    @Override
    public void breathe() {
        System.out.println("Animal: Breathing...in Cat");
    }
}
