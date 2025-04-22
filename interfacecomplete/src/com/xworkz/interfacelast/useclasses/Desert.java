package com.xworkz.interfacelast.useclasses;

import com.xworkz.interfacelast.interfacecs.Cactus;

public class Desert {
    Cactus cactus;

    public Desert(Cactus cactus){
        this.cactus=cactus;
        System.out.println("run cactus in desert");
    }

    public void execute(){
        if(this.cactus!=null){
            this.cactus.storeWater();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
