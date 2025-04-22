package com.xworkz.interfacelast.useclasses;

import com.xworkz.interfacelast.interfacecs.Animal;

public class Farm {
    Animal animal;

    public Farm(Animal animal){
        this.animal=animal;
        System.out.println("run animal in farm");
    }

    public void execute(){
        if(this.animal!=null){
            this.animal.sound();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
