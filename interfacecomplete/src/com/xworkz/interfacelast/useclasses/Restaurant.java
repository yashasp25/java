package com.xworkz.interfacelast.useclasses;

import com.xworkz.interfacelast.interfacecs.Chef;

public class Restaurant {
    Chef chef;

    public Restaurant(Chef chef){
        this.chef=chef;
        System.out.println("run chef in restaurant");
    }

    public void execute(){
        if(this.chef!=null){
            this.chef.cook();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
