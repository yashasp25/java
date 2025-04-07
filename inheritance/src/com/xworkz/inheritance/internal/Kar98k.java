package com.xworkz.inheritance.internal;

public class Kar98k extends Gun {
    public Kar98k() {
        super();
        System.out.println("Constructor in Kar98k");
    }

    @Override
    public void shoot() {
        System.out.println("Gun: Shooting...in Kar98k");
    }
    @Override
    public void reload() {
        System.out.println("Gun: Reloading...in Kar98k");
    }
    @Override
    public void aim() {
        System.out.println("Gun: Aiming...in Kar98k");
    }
    @Override
    public void switchMode() {
        System.out.println("Gun: Switching fire mode...in Kar98k");
    }
    @Override
    public void inspect() {
        System.out.println("Gun: Inspecting weapon...in Kar98k");
    }
    public void kar98kFire() {
        System.out.println("Firing with Kar98k.");
    }
}
