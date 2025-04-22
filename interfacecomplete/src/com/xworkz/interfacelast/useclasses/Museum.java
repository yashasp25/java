package com.xworkz.interfacelast.useclasses;

import com.xworkz.interfacelast.interfacecs.Exhibit;

public class Museum {
    Exhibit exhibit;

    public Museum(Exhibit exhibit){
        this.exhibit=exhibit;
        System.out.println("run exhibit in museum");
    }

    public void execute(){
        if(this.exhibit!=null){
            this.exhibit.display();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
