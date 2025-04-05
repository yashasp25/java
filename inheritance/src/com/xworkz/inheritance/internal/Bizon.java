package com.xworkz.inheritance.internal;

public class Bizon extends Gun {
    public Bizon() {
        super();
        System.out.println("Constructor in Bizon");
    }

    @Override
    public void shoot() {
        System.out.println("Gun: Shooting...in Bizon");
    }
    @Override
    public void reload() {
        System.out.println("Gun: Reloading...in Bizon");
    }
    @Override
    public void aim() {
        System.out.println("Gun: Aiming...in Bizon");
    }
    @Override
    public void switchMode() {
        System.out.println("Gun: Switching fire mode...in Bizon");
    }
    @Override
    public void inspect() {
        System.out.println("Gun: Inspecting weapon...in Bizon");
    }
}
