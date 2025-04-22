package com.xworkz.interfacelast.implement;

import com.xworkz.interfacelast.interfacecs.Mechanic;

public class MechanicImpl implements Mechanic {
    @Override
    public void repair() {
        System.out.println("run repair in implements");
    }
}
