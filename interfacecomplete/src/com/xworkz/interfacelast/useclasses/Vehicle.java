package com.xworkz.interfacelast.useclasses;

import com.xworkz.interfacelast.interfacecs.Engine;

public class Vehicle {
    Engine engine;

    public Vehicle(Engine engine){
        this.engine=engine;
        System.out.println("run engine in vehicle...");
    }

    public void execute(){
        if(this.engine!=null){
            this.engine.start();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
