package com.xworkz.inheritance.internal;

public class MRFTyre extends Tyre{

    public MRFTyre(){
        super();
        System.out.println("MRFTyre constructor");
    }
    @Override
    public void expand(){
        System.out.println("Expanding rubber in MRFtyre");
    }
}
