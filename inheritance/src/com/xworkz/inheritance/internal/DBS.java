package com.xworkz.inheritance.internal;

public class DBS extends Gun {
    public DBS() {
        super();
        System.out.println("Constructor in DBS");
    }

    @Override
    public void shoot() {
        System.out.println("Gun: Shooting...in DBS");
    }
    @Override
    public void reload() {
        System.out.println("Gun: Reloading...in DBS");
    }
    @Override
    public void aim() {
        System.out.println("Gun: Aiming...in DBS");
    }
    @Override
    public void switchMode() {
        System.out.println("Gun: Switching fire mode...in DBS");
    }
    @Override
    public void inspect() {
        System.out.println("Gun: Inspecting weapon...in DBS");
    }
}

