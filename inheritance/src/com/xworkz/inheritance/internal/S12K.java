package com.xworkz.inheritance.internal;

public class S12K extends Gun {
    public S12K() {
        super();
        System.out.println("Constructor in S12K");
    }

    @Override
    public void shoot() {
        System.out.println("Gun: Shooting...in S12K");
    }
    @Override
    public void reload() {
        System.out.println("Gun: Reloading...in S12K");
    }
    @Override
    public void aim() {
        System.out.println("Gun: Aiming...in S12K");
    }
    @Override
    public void switchMode() {
        System.out.println("Gun: Switching fire mode...in S12K");
    }
    @Override
    public void inspect() {
        System.out.println("Gun: Inspecting weapon...in S12K");
    }
}
