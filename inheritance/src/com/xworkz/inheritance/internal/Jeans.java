package com.xworkz.inheritance.internal;

public class Jeans extends Clothing {
    public Jeans() {
        super();
        System.out.println("Constructor in Jeans");
    }

    @Override
    public void wear() {
        System.out.println("Clothing: Wearing...in Jeans");
    }
    @Override
    public void wash() {
        System.out.println("Clothing: Washing...in Jeans");
    }
    @Override
    public void dry() {
        System.out.println("Clothing: Drying...in Jeans");
    }
    @Override
    public void iron() {
        System.out.println("Clothing: Ironing...in Jeans");
    }
    @Override
    public void fold() {
        System.out.println("Clothing: Folding...in Jeans");
    }
}
