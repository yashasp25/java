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

    @Override
    public void compress(){
        System.out.println("Compressing in tyre in mrf");
    }

    public void radial(){
        System.out.println("radial in mrf");
    }
}
