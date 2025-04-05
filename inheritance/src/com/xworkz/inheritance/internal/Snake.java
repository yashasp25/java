package com.xworkz.inheritance.internal;

public class Snake extends Animal {
    public Snake() {
        super();
        System.out.println("Constructor in Snake");
    }

    @Override
    public void eat() {
        System.out.println("Animal: Eating...in Snake");
    }
    @Override
    public void sleep() {
        System.out.println("Animal: Sleeping...in Snake");
    }
    @Override
    public void makeSound() {
        System.out.println("Animal: Making sound...in Snake");
    }
    @Override
    public void move() {
        System.out.println("Animal: Moving...in Snake");
    }
    @Override
    public void breathe() {
        System.out.println("Animal: Breathing...in Snake");
    }
}
