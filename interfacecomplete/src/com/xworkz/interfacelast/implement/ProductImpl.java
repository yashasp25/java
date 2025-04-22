package com.xworkz.interfacelast.implement;

import com.xworkz.interfacelast.interfacecs.Product;

public class ProductImpl implements Product {
    @Override
    public void sell() {
        System.out.println("run sell in implements");
    }
}
