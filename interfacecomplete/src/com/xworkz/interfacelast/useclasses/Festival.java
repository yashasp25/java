package com.xworkz.interfacelast.useclasses;

import com.xworkz.interfacelast.interfacecs.Event;

public class Festival {
    Event event;

    public Festival(Event event){
        this.event=event;
        System.out.println("run event in festival");
    }

    public void execute(){
        if(this.event!=null){
            this.event.celebrate();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
