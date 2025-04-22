package com.xworkz.interfacelast.useclasses;

import com.xworkz.interfacelast.interfacecs.Flower;

public class Garden {
    Flower flower;

    public Garden(Flower flower){
        this.flower=flower;
        System.out.println("run flower in garden");
    }

    public void execute(){
        if(this.flower!=null){
            this.flower.bloom();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
