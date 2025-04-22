package com.xworkz.interfacelast.useclasses;

import com.xworkz.interfacelast.interfacecs.Film;

public class Cinema {
    Film film;

    public Cinema(Film film){
        this.film=film;
        System.out.println("run film in cinema");
    }

    public void execute(){
        if(this.film!=null){
            this.film.screen();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
