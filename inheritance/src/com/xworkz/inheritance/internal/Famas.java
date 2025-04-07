package com.xworkz.inheritance.internal;

public class Famas extends Gun {
    public Famas() {
        super();
        System.out.println("Constructor in Famas");
    }

    @Override
    public void shoot() {
        System.out.println("Gun: Shooting...in FAMAS");
    }
    @Override
    public void reload() {
        System.out.println("Gun: Reloading...in FAMAS");
    }
    @Override
    public void aim() {
        System.out.println("Gun: Aiming...in FAMAS");
    }
    @Override
    public void switchMode() {
        System.out.println("Gun: Switching fire mode...in FAMAS");
    }
    @Override
    public void inspect() {
        System.out.println("Gun: Inspecting weapon...in FAMAS");
    }
    public void famasFire() {
        System.out.println("Firing with Famas.");
    }
}
