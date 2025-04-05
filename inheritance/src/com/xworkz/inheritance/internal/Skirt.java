package com.xworkz.inheritance.internal;

public class Skirt extends Clothing {
    public Skirt() {
        super();
        System.out.println("Constructor in Skirt");
    }

    @Override
    public void wear() {
        System.out.println("Clothing: Wearing...in Skirt");
    }
    @Override
    public void wash() {
        System.out.println("Clothing: Washing...in Skirt");
    }
    @Override
    public void dry() {
        System.out.println("Clothing: Drying...in Skirt");
    }
    @Override
    public void iron() {
        System.out.println("Clothing: Ironing...in Skirt");
    }
    @Override
    public void fold() {
        System.out.println("Clothing: Folding...in Skirt");
    }
}
