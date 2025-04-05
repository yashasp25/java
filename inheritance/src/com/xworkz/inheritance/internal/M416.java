package com.xworkz.inheritance.internal;

public class M416 extends Gun {
    public M416() {
        super();
        System.out.println("Constructor in M416");
    }

    @Override
    public void shoot() {
        System.out.println("Gun: Shooting...in M416");
    }
    @Override
    public void reload() {
        System.out.println("Gun: Reloading...in M416");
    }
    @Override
    public void aim() {
        System.out.println("Gun: Aiming...in M416");
    }
    @Override
    public void switchMode() {
        System.out.println("Gun: Switching fire mode...in M416");
    }
    @Override
    public void inspect() {
        System.out.println("Gun: Inspecting weapon...in M416");
    }
}
