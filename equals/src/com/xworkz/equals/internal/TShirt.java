package com.xworkz.equals.internal;

import java.util.Objects;

public class TShirt {
    private String brand;
    private int size;
    private String color;

    public TShirt(){
        System.out.println("no arg constructor of TShirt");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null) {
            System.out.println("ref is not null");
            if (o instanceof TShirt) {
                System.out.println(" ref is tshirt, will compare");
                TShirt tShirt = this;
                TShirt tShirt1 = (TShirt) o;
                if (tShirt.size == tShirt1.size && tShirt.brand.equals(tShirt1.brand) && tShirt.color.equals(tShirt1.color)) {
                    System.out.println("Both tshirt are same");
                    return true;
                }
            }
        }
        return false;
    }
}
