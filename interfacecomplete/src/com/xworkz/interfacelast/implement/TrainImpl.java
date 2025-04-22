package com.xworkz.interfacelast.implement;

import com.xworkz.interfacelast.interfacecs.Train;

public class TrainImpl implements Train {
    @Override
    public void depart() {
        System.out.println("run depart in implements");
    }
}
