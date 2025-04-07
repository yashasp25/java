package com.xworkz.inheritance.internal;

public class SCARL extends Gun {
    public SCARL() {
        super();
        System.out.println("Constructor in SCAR-L");
    }

    @Override
    public void shoot() {
        System.out.println("Gun: Shooting...in SCAR-L");
    }
    @Override
    public void reload() {
        System.out.println("Gun: Reloading...in SCAR-L");
    }
    @Override
    public void aim() {
        System.out.println("Gun: Aiming...in SCAR-L");
    }
    @Override
    public void switchMode() {
        System.out.println("Gun: Switching fire mode...in SCAR-L");
    }
    @Override
    public void inspect() {
        System.out.println("Gun: Inspecting weapon...in SCAR-L");
    }
    public void scarlFire() {
        System.out.println("Firing with SCAR-L.");
    }
}
