package com.xworkz.variables;

public class VandM {
    public int age;
    private short height;
    String name;

    public void eat(){
        System.out.println("Public eat");
    }

    private void doo(){
        System.out.println("Private do");
    }

    void does(){
        System.out.println("default do");
    }
}
