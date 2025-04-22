package com.xworkz.interfacelast.useclasses;

import com.xworkz.interfacelast.implement.CitizenConstitutionImpl;

public class Government {
    CitizenConstitutionImpl citizenConstitution;

    public Government(CitizenConstitutionImpl citizenConstitution) {
        this.citizenConstitution = citizenConstitution;
        System.out.println("citizen constitution implementation...");
    }

    public void execute() {
        if (this.citizenConstitution != null) {
            this.citizenConstitution.followLaws();
        } else {
            System.out.println("null value, can not print");
        }
    }
}
