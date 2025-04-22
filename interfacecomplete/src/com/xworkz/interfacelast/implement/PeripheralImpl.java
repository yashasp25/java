package com.xworkz.interfacelast.implement;

import com.xworkz.interfacelast.interfacecs.Peripheral;

public class PeripheralImpl implements Peripheral {
    @Override
    public void connect() {
        System.out.println("run connect in implements");
    }
}
