package com.xworkz.country;

public class Country {

    PrimeMinister primeMinister;
    String name="India";

    public Country(){
        this.primeMinister=new PrimeMinister();
        System.out.println("Country has PrimeMinister");
    }

    public void display(){
        System.out.println("This is Country "+name);
        primeMinister.display();
    }
}

