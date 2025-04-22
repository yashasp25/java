package com.xworkz.interfacelast.implement;

import com.xworkz.interfacelast.interfacecs.Document;

public class DocumentImpl implements Document {
    @Override
    public void print() {
        System.out.println("run print in implements");
    }
}
