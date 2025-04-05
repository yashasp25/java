package com.xworkz.inheritance.internal;

public class AWM extends Gun {
    public AWM() {
        super();
        System.out.println("Constructor in AWM");
    }

    @Override
    public void shoot() {
        System.out.println("Gun: Shooting...in AWM");
    }
    @Override
    public void reload() {
        System.out.println("Gun: Reloading...in AWM");
    }
    @Override
    public void aim() {
        System.out.println("Gun: Aiming...in AWM");
    }
    @Override
    public void switchMode() {
        System.out.println("Gun: Switching fire mode...in AWM");
    }
    @Override
    public void inspect() {
        System.out.println("Gun: Inspecting weapon...in AWM");
    }
}
