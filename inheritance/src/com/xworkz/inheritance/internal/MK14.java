package com.xworkz.inheritance.internal;

public class MK14 extends Gun {
    public MK14() {
        super();
        System.out.println("Constructor in MK14");
    }

    @Override
    public void shoot() {
        System.out.println("Gun: Shooting...in MK14");
    }
    @Override
    public void reload() {
        System.out.println("Gun: Reloading...in MK14");
    }
    @Override
    public void aim() {
        System.out.println("Gun: Aiming...in MK14");
    }
    @Override
    public void switchMode() {
        System.out.println("Gun: Switching fire mode...in MK14");
    }
    @Override
    public void inspect() {
        System.out.println("Gun: Inspecting weapon...in MK14");
    }
}
