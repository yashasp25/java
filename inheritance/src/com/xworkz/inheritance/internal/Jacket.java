package com.xworkz.inheritance.internal;

public class Jacket extends Clothing {
    public Jacket() {
        super();
        System.out.println("Constructor in Jacket");
    }

    @Override
    public void wear() {
        System.out.println("Clothing: Wearing...in Jacket");
    }
    @Override
    public void wash() {
        System.out.println("Clothing: Washing...in Jacket");
    }
    @Override
    public void dry() {
        System.out.println("Clothing: Drying...in Jacket");
    }
    @Override
    public void iron() {
        System.out.println("Clothing: Ironing...in Jacket");
    }
    @Override
    public void fold() {
        System.out.println("Clothing: Folding...in Jacket");
    }
}
