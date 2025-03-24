package com.xworkz.variables;

public class Call {
    public static void main(String[] args) {
        VandM vandm =new VandM();
        vandm.age=12;
        vandm.name="yash";
        vandm.eat();
        System.out.println("age: "+vandm.age);
        System.out.println("name: "+vandm.name);
    }
}
