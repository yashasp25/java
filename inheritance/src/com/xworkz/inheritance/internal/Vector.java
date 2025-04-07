package com.xworkz.inheritance.internal;

public class Vector extends Gun {
    public Vector() {
        super();
        System.out.println("Constructor in Vector");
    }

    @Override
    public void shoot() {
        System.out.println("Gun: Shooting...in Vector");
    }
    @Override
    public void reload() {
        System.out.println("Gun: Reloading...in Vector");
    }
    @Override
    public void aim() {
        System.out.println("Gun: Aiming...in Vector");
    }
    @Override
    public void switchMode() {
        System.out.println("Gun: Switching fire mode...in Vector");
    }
    @Override
    public void inspect() {
        System.out.println("Gun: Inspecting weapon...in Vector");
    }
    public void vectorFire() {
        System.out.println("Firing with Vector.");
    }
}
