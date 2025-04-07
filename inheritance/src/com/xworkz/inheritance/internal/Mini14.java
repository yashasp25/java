package com.xworkz.inheritance.internal;

public class Mini14 extends Gun {
    public Mini14() {
        super();
        System.out.println("Constructor in Mini-14");
    }

    @Override
    public void shoot() {
        System.out.println("Gun: Shooting...in Mini14");
    }
    @Override
    public void reload() {
        System.out.println("Gun: Reloading...in Mini14");
    }
    @Override
    public void aim() {
        System.out.println("Gun: Aiming...in Mini14");
    }
    @Override
    public void switchMode() {
        System.out.println("Gun: Switching fire mode...in Mini14");
    }
    @Override
    public void inspect() {
        System.out.println("Gun: Inspecting weapon...in Mini14");
    }
    public void mini14Fire() {
        System.out.println("Firing with Mini-14.");
    }
}
