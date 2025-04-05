package com.xworkz.inheritance.internal;

public class DP28 extends Gun {
    public DP28() {
        super();
        System.out.println("Constructor in DP-28");
    }

    @Override
    public void shoot() {
        System.out.println("Gun: Shooting...in DP28");
    }
    @Override
    public void reload() {
        System.out.println("Gun: Reloading...in DP28");
    }
    @Override
    public void aim() {
        System.out.println("Gun: Aiming...in DP28");
    }
    @Override
    public void switchMode() {
        System.out.println("Gun: Switching fire mode...in DP28");
    }
    @Override
    public void inspect() {
        System.out.println("Gun: Inspecting weapon...in DP28");
    }
}
