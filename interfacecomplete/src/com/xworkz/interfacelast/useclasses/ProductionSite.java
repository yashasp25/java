package com.xworkz.interfacelast.useclasses;

import com.xworkz.interfacelast.interfacecs.Director;

public class ProductionSite {
    Director director;

    public ProductionSite(Director director){
        this.director=director;
        System.out.println("run director in production site");
    }

    public void execute(){
        if(this.director!=null){
            this.director.direct();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
