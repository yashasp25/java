package com.xworkz.inheritance.internal;

public class TShirt extends Clothing {
    public TShirt() {
        super();
        System.out.println("Constructor in TShirt");
    }


    @Override
    public void wear() {
        System.out.println("Clothing: Wearing...in Tshirt");
    }
    @Override
    public void wash() {
        System.out.println("Clothing: Washing...in Tshirt");
    }
    @Override
    public void dry() {
        System.out.println("Clothing: Drying...in Tshirt");
    }
    @Override
    public void iron() {
        System.out.println("Clothing: Ironing...in Tshirt");
    }
    @Override
    public void fold() {
        System.out.println("Clothing: Folding...in Tshirt");
    }
}
