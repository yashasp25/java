package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.internal.ArmyVehicle;
import com.xworkz.inheritance.internal.MRFTyre;
import com.xworkz.inheritance.internal.Rubber;
import com.xworkz.inheritance.internal.Tyre;

public class Runner {
    public static void main(String[] args) {
        Rubber rubber = new Tyre();
        rubber.expand();

        Tyre tyre = new Tyre();
        tyre.expand();

        Rubber rubber1 = new Rubber();
        rubber1.expand();

        MRFTyre mrfTyre = new MRFTyre();

        ArmyVehicle armyVehicle =new ArmyVehicle();
        armyVehicle.wheel(rubber);
        armyVehicle.wheel(tyre);
        armyVehicle.wheel(rubber1);
        armyVehicle.wheel(mrfTyre);
    }
}
