package com.xworkz.interfacelast.useclasses;

import com.xworkz.interfacelast.interfacecs.Satellite;

public class Planet {
    Satellite satellite;

    public Planet(Satellite satellite){
        this.satellite=satellite;
        System.out.println("run satellite in planet..");
    }

    public void execute(){
        if(this.satellite!=null){
            this.satellite.orbit();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
