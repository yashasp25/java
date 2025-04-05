package com.xworkz.inheritance.internal;

public class Trousers extends Clothing {
    public Trousers() {
        super();
        System.out.println("Constructor in Trousers");
    }


    @Override
    public void wear() {
        System.out.println("Clothing: Wearing...in Trousers");
    }
    @Override
    public void wash() {
        System.out.println("Clothing: Washing...in Trousers");
    }
    @Override
    public void dry() {
        System.out.println("Clothing: Drying...in Trousers");
    }
    @Override
    public void iron() {
        System.out.println("Clothing: Ironing...in Trousers");
    }
    @Override
    public void fold() {
        System.out.println("Clothing: Folding...in Trousers");
    }
}
