package com.xworkz.interfacelast.useclasses;

import com.xworkz.interfacelast.interfacecs.Worker;

public class Construction {
    Worker worker;

    public Construction(Worker worker){
        this.worker=worker;
        System.out.println("run worker in construction");
    }

    public void execute(){
        if(this.worker!=null){
            this.worker.build();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
