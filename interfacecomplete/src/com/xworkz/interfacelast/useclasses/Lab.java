package com.xworkz.interfacelast.useclasses;

import com.xworkz.interfacelast.interfacecs.Scientist;

public class Lab {
    Scientist scientist;

    public Lab(Scientist scientist){
        this.scientist=scientist;
        System.out.println("run scientist in lab");
    }

    public void execute(){
        if(this.scientist!=null){
            this.scientist.expirement();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
