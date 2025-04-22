package com.xworkz.interfacelast.useclasses;

import com.xworkz.interfacelast.interfacecs.VehicleType;

public class Road {
    VehicleType vehicleType;

    public Road(VehicleType vehicleType){
        this.vehicleType=vehicleType;
        System.out.println("run vehicle type in road");
    }

    public void execute(){
        if(this.vehicleType!=null){
            this.vehicleType.move();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
