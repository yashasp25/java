package com.xworkz.inheritance.internal;

public class P90 extends Gun {
    public P90() {
        super();
        System.out.println("Constructor in P90");
    }

    @Override
    public void shoot() {
        System.out.println("Gun: Shooting...in P90");
    }
    @Override
    public void reload() {
        System.out.println("Gun: Reloading...in P90");
    }
    @Override
    public void aim() {
        System.out.println("Gun: Aiming...in P90");
    }
    @Override
    public void switchMode() {
        System.out.println("Gun: Switching fire mode...in P90");
    }
    @Override
    public void inspect() {
        System.out.println("Gun: Inspecting weapon...in P90");
    }
}
