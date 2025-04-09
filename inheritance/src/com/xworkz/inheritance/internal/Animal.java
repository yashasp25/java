package com.xworkz.inheritance.internal;

public class Animal {

    private String color;
    private int legs;
    private int age;

    Animal(){}

    public Animal(int age,int legs,String color) {
        this.age=age;
        this.legs=legs;
        this.color = color;
        System.out.println("Constructor in Animal");
    }


    public void eat() {
        System.out.println("Animal: Eating...");
    }

    public void sleep() {
        System.out.println("Animal: Sleeping...");
    }

    public void makeSound() {
        System.out.println("Animal: Making sound...");
    }

    public void move() {
        System.out.println("Animal: Moving...");
    }

    public void breathe() {
        System.out.println("Animal: Breathing...");
    }
}
