package com.xworkz.country;
import com.xworkz.geography.State;
public class Portfolio {
    private String name;
    private State[] states;
    private Security security;

    public Portfolio(String name) {
        this.name = name;
        this.states = new State[]{new State("Karnataka")};
        this.security = new Security();
    }

    public void display() {
        System.out.println("Portfolio: " + name);

    }
}