package com.xworkz.interfacelast.useclasses;

import com.xworkz.interfacelast.interfacecs.Bike;

public class Trip {
    Bike bike;

    public Trip(Bike bike){
        this.bike=bike;
        System.out.println("run bike in trip");
    }

    public void execute(){
        if(this.bike!=null){
            this.bike.drive();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
