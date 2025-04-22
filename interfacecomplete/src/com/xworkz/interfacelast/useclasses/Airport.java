package com.xworkz.interfacelast.useclasses;

import com.xworkz.interfacelast.interfacecs.Aircraft;

public class Airport {
    Aircraft aircraft;

    public Airport(Aircraft aircraft){
        this.aircraft=aircraft;
        System.out.println("run aircraft in airport");
    }

    public void execute(){
        if(this.aircraft!=null){
            this.aircraft.fly();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
