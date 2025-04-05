package com.xworkz.inheritance.internal;

public class Dog extends Animal {
    public Dog() {
        super();
        System.out.println("Constructor in Dog");
    }
    @Override
    public void eat() {
        System.out.println("Animal: Eating...in Dog");
    }
    @Override
    public void sleep() {
        System.out.println("Animal: Sleeping...in Dog");
    }
    @Override
    public void makeSound() {
        System.out.println("Animal: Making sound...in Dog");
    }
    @Override
    public void move() {
        System.out.println("Animal: Moving...in Dog");
    }
    @Override
    public void breathe() {
        System.out.println("Animal: Breathing...in Dog");
    }
}
