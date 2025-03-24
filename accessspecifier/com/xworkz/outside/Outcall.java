package com.xworkz.outside;

import com.xworkz.variables.VandM;

public class Outcall {
    public static void main(String[] args) {
        VandM vandm =new VandM();
        vandm.eat();
        vandm.age=13;
        System.out.println("age: "+vandm.age);
    }
}
