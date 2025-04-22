package com.xworkz.interfacelast.implement;

import com.xworkz.interfacelast.interfacecs.Instrument;

public class InstrumentImpl implements Instrument {
    @Override
    public void playNote() {
        System.out.println("run playNote in implements");
    }
}
