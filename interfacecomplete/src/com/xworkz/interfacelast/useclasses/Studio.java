package com.xworkz.interfacelast.useclasses;

import com.xworkz.interfacelast.interfacecs.Artist;

public class Studio {
    Artist artist;

    public Studio(Artist artist){
        this.artist=artist;
        System.out.println("run artist in studio");
    }

    public void execute(){
        if(this.artist!=null){
            this.artist.art();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
