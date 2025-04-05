package com.xworkz.inheritance.internal;

public class Dress extends Clothing {
    public Dress() {
        super();
        System.out.println("Constructor in Dress");
    }


    @Override
    public void wear() {
        System.out.println("Clothing: Wearing...in Dress");
    }
    @Override
    public void wash() {
        System.out.println("Clothing: Washing...in Dress");
    }
    @Override
    public void dry() {
        System.out.println("Clothing: Drying...in Dress");
    }
    @Override
    public void iron() {
        System.out.println("Clothing: Ironing...in Dress");
    }
    @Override
    public void fold() {
        System.out.println("Clothing: Folding...in Dress");
    }
}
