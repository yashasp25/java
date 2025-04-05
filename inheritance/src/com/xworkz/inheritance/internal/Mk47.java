package com.xworkz.inheritance.internal;

public class Mk47 extends Gun {
    public Mk47() {
        super();
        System.out.println("Constructor in Mk47");
    }

    @Override
    public void shoot() {
        System.out.println("Gun: Shooting...in MK47");
    }
    @Override
    public void reload() {
        System.out.println("Gun: Reloading...in MK47");
    }
    @Override
    public void aim() {
        System.out.println("Gun: Aiming...in MK47");
    }
    @Override
    public void switchMode() {
        System.out.println("Gun: Switching fire mode...in MK47");
    }
    @Override
    public void inspect() {
        System.out.println("Gun: Inspecting weapon...in MK47");
    }
}
