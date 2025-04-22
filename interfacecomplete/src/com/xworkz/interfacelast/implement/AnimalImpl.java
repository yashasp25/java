package com.xworkz.interfacelast.implement;

import com.xworkz.interfacelast.interfacecs.Animal;

public class AnimalImpl implements Animal {
    @Override
    public void sound() {
        System.out.println("run sound in implements");
    }
}
