package com.xworkz.inheritance.internal;

public class Tyre extends Rubber{

    public Tyre(){
        super();
        System.out.println("Tyre constructor");
    }

    public void compress(){
        System.out.println("Compressing in tyre");
    }

    @Override
    public void expand(){
        System.out.println("Expanding rubber in tyre");
    }
}
