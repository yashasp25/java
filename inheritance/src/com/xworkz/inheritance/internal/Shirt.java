package com.xworkz.inheritance.internal;

public class Shirt extends Clothing {
    public Shirt() {
        super();
        System.out.println("Constructor in Shirt");
    }

    @Override
    public void wear() {
        System.out.println("Clothing: Wearing...in Shirt");
    }
    @Override
    public void wash() {
        System.out.println("Clothing: Washing...in Shirt");
    }
    @Override
    public void dry() {
        System.out.println("Clothing: Drying...in Shirt");
    }
    @Override
    public void iron() {
        System.out.println("Clothing: Ironing...in Shirt");
    }
    @Override
    public void fold() {
        System.out.println("Clothing: Folding...in Shirt");
    }
}
