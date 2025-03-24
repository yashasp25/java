package com.xworkz.country;

public class Security {
    private Personnel[] personnel;

    public Security() {
        this.personnel = new Personnel[]{new Personnel("KA CM")};
    }

    public void display() {
        System.out.println("Security Details:");

    }
}