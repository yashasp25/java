package com.xworkz.inheritance.internal;

public class AUG extends Gun {
    public AUG() {
        super();
        System.out.println("Constructor in AUG");
    }

    @Override
    public void shoot() {
        System.out.println("Gun: Shooting...in AUG");
    }
    @Override
    public void reload() {
        System.out.println("Gun: Reloading...in AUG");
    }
    @Override
    public void aim() {
        System.out.println("Gun: Aiming...in AUG");
    }
    @Override
    public void switchMode() {
        System.out.println("Gun: Switching fire mode...in AUG");
    }
    @Override
    public void inspect() {
        System.out.println("Gun: Inspecting weapon...in AUG");
    }
    public void augFire() {
        System.out.println("Firing with AUG.");
    }
}
