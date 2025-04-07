package com.xworkz.inheritance.internal;

public class MP5K extends Gun {
    public MP5K() {
        super();
        System.out.println("Constructor in MP5K");
    }

    @Override
    public void shoot() {
        System.out.println("Gun: Shooting...in MP5K");
    }
    @Override
    public void reload() {
        System.out.println("Gun: Reloading...in MP5K");
    }
    @Override
    public void aim() {
        System.out.println("Gun: Aiming...in MP5K");
    }
    @Override
    public void switchMode() {
        System.out.println("Gun: Switching fire mode...in MP5K");
    }
    @Override
    public void inspect() {
        System.out.println("Gun: Inspecting weapon...in MP5K");
    }
    public void mp5kFire() {
        System.out.println("Firing with MP5K.");
    }
}
