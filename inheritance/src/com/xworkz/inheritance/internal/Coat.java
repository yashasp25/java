package com.xworkz.inheritance.internal;

public class Coat extends Clothing {
    public Coat() {
        super();
        System.out.println("Constructor in Coat");
    }

    @Override
    public void wear() {
        System.out.println("Clothing: Wearing...in Coat");
    }
    @Override
    public void wash() {
        System.out.println("Clothing: Washing...in Coat");
    }
    @Override
    public void dry() {
        System.out.println("Clothing: Drying...in Coat");
    }
    @Override
    public void iron() {
        System.out.println("Clothing: Ironing...in Coat");
    }
    @Override
    public void fold() {
        System.out.println("Clothing: Folding...in Coat");
    }
}
