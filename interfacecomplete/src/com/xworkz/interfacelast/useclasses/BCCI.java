package com.xworkz.interfacelast.useclasses;


import com.xworkz.interfacelast.implement.IndianCricketTeamIccImpl;

public class BCCI {
    IndianCricketTeamIccImpl indianCricketTeamIcc;

  public BCCI(IndianCricketTeamIccImpl indianCricketTeamIcc){
        this.indianCricketTeamIcc=indianCricketTeamIcc;
        System.out.println("indian cricket team icc implementation...");
    }
    public void execute() {
        if (this.indianCricketTeamIcc != null) {
            this.indianCricketTeamIcc.fairPlay();
        }
        else{
            System.out.println("null value,can not print");
        }
    }
}
