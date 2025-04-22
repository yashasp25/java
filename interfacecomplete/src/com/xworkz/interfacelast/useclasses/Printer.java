package com.xworkz.interfacelast.useclasses;

import com.xworkz.interfacelast.interfacecs.Document;

public class Printer {
    Document document;

    public Printer(Document document){
        this.document=document;
        System.out.println("run document in printer");
    }

    public void execute(){
        if(this.document!=null){
            this.document.print();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
