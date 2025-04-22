package com.xworkz.interfacelast.useclasses;

import com.xworkz.interfacelast.interfacecs.Productline;

public class Industry {
    Productline productline;

    public Industry(Productline productline){
        this.productline=productline;
        System.out.println("run product line in industry");
    }

    public void execute(){
        if(this.productline!=null){
            this.productline.produce();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
