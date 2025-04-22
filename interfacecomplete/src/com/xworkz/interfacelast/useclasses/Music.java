package com.xworkz.interfacelast.useclasses;

import com.xworkz.interfacelast.interfacecs.Instrument;

public class Music {
    Instrument instrument;

    public Music(Instrument instrument){
        this.instrument=instrument;
        System.out.println("run instrument in music");
    }

    public void execute(){
        if(this.instrument!=null){
            this.instrument.playNote();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
