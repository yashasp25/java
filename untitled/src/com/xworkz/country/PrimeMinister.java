package com.xworkz.country;

public class PrimeMinister {
    Minister[] minister;
    String name="Narendra Modi";
    public PrimeMinister(){
        minister=new Minister[]{new Minister("Siddaramiah")};

    }

    public void display(){
        System.out.println("Prime Minister of India is : " +name);
        for(Minister minister1: minister){
            minister1.display();
        }
    }
}