package com.xworkz.inheritance.internal;

public class M249 extends Gun {
    public M249() {
        super();
        System.out.println("Constructor in M249");
    }

    @Override
    public void shoot() {
        System.out.println("Gun: Shooting...in M249");
    }
    @Override
    public void reload() {
        System.out.println("Gun: Reloading...in M249");
    }
    @Override
    public void aim() {
        System.out.println("Gun: Aiming...in M249");
    }
    @Override
    public void switchMode() {
        System.out.println("Gun: Switching fire mode...in M249");
    }
    @Override
    public void inspect() {
        System.out.println("Gun: Inspecting weapon...in M249");
    }
    public void m249Fire() {
        System.out.println("Firing with M249.");
    }
}
