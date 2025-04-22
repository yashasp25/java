package com.xworkz.interfacelast.useclasses;

import com.xworkz.interfacelast.interfacecs.Doctor;

public class Hospital {
    Doctor doctor;

    public Hospital(Doctor doctor){
        this.doctor=doctor;
        System.out.println("run doctor in hospital..");
    }

    public void execute(){
        if(this.doctor!=null){
            this.doctor.treatPatient();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
