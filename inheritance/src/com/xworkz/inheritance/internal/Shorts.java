package com.xworkz.inheritance.internal;

public class Shorts extends Clothing {
    public Shorts() {
        super();
        System.out.println("Constructor in Shorts");
    }

    @Override
    public void wear() {
        System.out.println("Clothing: Wearing...in Shorts");
    }
    @Override
    public void wash() {
        System.out.println("Clothing: Washing...in Shorts");
    }
    @Override
    public void dry() {
        System.out.println("Clothing: Drying...in Shorts");
    }
    @Override
    public void iron() {
        System.out.println("Clothing: Ironing...in Shorts");
    }
    @Override
    public void fold() {
        System.out.println("Clothing: Folding...in Shorts");
    }
}
