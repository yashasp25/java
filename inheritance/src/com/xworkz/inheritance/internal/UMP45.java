package com.xworkz.inheritance.internal;

public class UMP45 extends Gun {
    public UMP45() {
        super();
        System.out.println("Constructor in UMP45");
    }

    @Override
    public void shoot() {
        System.out.println("Gun: Shooting...in UMP45");
    }
    @Override
    public void reload() {
        System.out.println("Gun: Reloading...in UMP45");
    }
    @Override
    public void aim() {
        System.out.println("Gun: Aiming...in UMP45");
    }
    @Override
    public void switchMode() {
        System.out.println("Gun: Switching fire mode...in UMP45");
    }
    @Override
    public void inspect() {
        System.out.println("Gun: Inspecting weapon...in UMP45");
    }
    public void ump45Fire() {
        System.out.println("Firing with UMP45.");
    }
}
