package com.xworkz.interfacelast.useclasses;

import com.xworkz.interfacelast.interfacecs.Trainer;

public class Gym {
    Trainer trainer;

    public Gym(Trainer trainer){
        this.trainer=trainer;
        System.out.println("run trainer in gym");
    }

    public void execute(){
        if(this.trainer!=null){
            this.trainer.train();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
