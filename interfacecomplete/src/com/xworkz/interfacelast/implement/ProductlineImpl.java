package com.xworkz.interfacelast.implement;

import com.xworkz.interfacelast.interfacecs.Productline;

public class ProductlineImpl implements Productline {
    @Override
    public void produce() {
        System.out.println("run produce in implements");
    }
}
