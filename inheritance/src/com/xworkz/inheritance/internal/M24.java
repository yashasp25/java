package com.xworkz.inheritance.internal;

public class M24 extends Gun {
    public M24() {
        super();
        System.out.println("Constructor in M24");
    }

    @Override
    public void shoot() {
        System.out.println("Gun: Shooting...in m24");
    }
    @Override
    public void reload() {
        System.out.println("Gun: Reloading...in m24");
    }
    @Override
    public void aim() {
        System.out.println("Gun: Aiming...in m24");
    }
    @Override
    public void switchMode() {
        System.out.println("Gun: Switching fire mode...in m24");
    }
    @Override
    public void inspect() {
        System.out.println("Gun: Inspecting weapon...in m24");
    }
    public void m24Fire() {
        System.out.println("Firing with M24.");
    }
}
