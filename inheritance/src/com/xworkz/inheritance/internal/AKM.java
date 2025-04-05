package com.xworkz.inheritance.internal;

public class AKM extends Gun {
    public AKM() {
        super();
        System.out.println("Constructor in AKM");
    }

    @Override
    public void shoot() {
        System.out.println("Gun: Shooting...in AKM");
    }
    @Override
    public void reload() {
        System.out.println("Gun: Reloading...in AKM");
    }
    @Override
    public void aim() {
        System.out.println("Gun: Aiming...in AKM");
    }
    @Override
    public void switchMode() {
        System.out.println("Gun: Switching fire mode...in AKM");
    }
    @Override
    public void inspect() {
        System.out.println("Gun: Inspecting weapon...in AKM");
    }
}
