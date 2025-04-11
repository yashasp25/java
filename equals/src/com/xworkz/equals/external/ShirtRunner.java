package com.xworkz.equals.external;

import com.xworkz.equals.internal.TShirt;

public class ShirtRunner {
    public static void main(String[] args) {
        TShirt tShirt = new TShirt();
        tShirt.setSize(38);
        tShirt.setBrand("Polo");
        tShirt.setColor("Blue");

        TShirt tShirt1 = new TShirt();
        tShirt1.setSize(38);
        tShirt1.setBrand("Polo");
        tShirt1.setColor("Blue");

        TShirt tShirt2 = new TShirt();
        tShirt2.setSize(38);
        tShirt2.setBrand("Soul");
        tShirt2.setColor("Yello");

        System.out.println(tShirt.equals(tShirt1));
        System.out.println(tShirt.equals(tShirt2));
    }
}
