package com.xworkz.interfacelast.implement;


import com.xworkz.interfacelast.interfacecs.Pet;

public class PetImpl implements Pet {
    @Override
    public void feed() {
        System.out.println("run feed in implements");
    }
}
