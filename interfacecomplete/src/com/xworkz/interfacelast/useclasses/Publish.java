package com.xworkz.interfacelast.useclasses;

import com.xworkz.interfacelast.interfacecs.Editor;

public class Publish {
    Editor editor;

    public Publish(Editor editor){
        this.editor=editor;
        System.out.println("run editor in publish");
    }

    public void execute(){
        if(this.editor!=null){
            this.editor.edit();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
