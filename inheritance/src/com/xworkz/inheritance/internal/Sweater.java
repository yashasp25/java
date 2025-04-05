package com.xworkz.inheritance.internal;

public class Sweater extends Clothing {
    public Sweater() {
        super();
        System.out.println("Constructor in Sweater");
    }

    @Override
    public void wear() {
        System.out.println("Clothing: Wearing...in Sweater");
    }
    @Override
    public void wash() {
        System.out.println("Clothing: Washing...in Sweater");
    }
    @Override
    public void dry() {
        System.out.println("Clothing: Drying...in Sweater");
    }
    @Override
    public void iron() {
        System.out.println("Clothing: Ironing...in Sweater");
    }
    @Override
    public void fold() {
        System.out.println("Clothing: Folding...in Sweater");
    }
}
