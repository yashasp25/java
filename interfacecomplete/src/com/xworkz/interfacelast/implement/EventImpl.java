package com.xworkz.interfacelast.implement;

import com.xworkz.interfacelast.interfacecs.Event;

public class EventImpl implements Event {
    @Override
    public void celebrate() {
        System.out.println("run celebrate in implements");
    }
}
