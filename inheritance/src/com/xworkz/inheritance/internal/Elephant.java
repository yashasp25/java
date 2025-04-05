package com.xworkz.inheritance.internal;

public class Elephant extends Animal {
    public Elephant() {
        super();
        System.out.println("Constructor in Elephant");
    }
    @Override
    public void eat() {
        System.out.println("Animal: Eating...in Elephant");
    }
    @Override
    public void sleep() {
        System.out.println("Animal: Sleeping...in Elephant");
    }
    @Override
    public void makeSound() {
        System.out.println("Animal: Making sound...in Elephant");
    }
    @Override
    public void move() {
        System.out.println("Animal: Moving...in Elephant");
    }
    @Override
    public void breathe() {
        System.out.println("Animal: Breathing...in Elephant");
    }
}
