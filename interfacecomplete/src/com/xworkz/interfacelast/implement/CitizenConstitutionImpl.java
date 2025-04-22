package com.xworkz.interfacelast.implement;

import com.xworkz.interfacelast.interfacecs.Constitution;

public class CitizenConstitutionImpl implements Constitution {
    @Override
    public void followLaws() {
        System.out.println("Citizen follows the Constitution's laws.");
    }
}
