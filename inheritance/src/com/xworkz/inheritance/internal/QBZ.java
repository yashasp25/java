package com.xworkz.inheritance.internal;

public class QBZ extends Gun {
    public QBZ() {
        super();
        System.out.println("Constructor in QBZ");
    }

    @Override
    public void shoot() {
        System.out.println("Gun: Shooting...in QBZ");
    }
    @Override
    public void reload() {
        System.out.println("Gun: Reloading...in QBZ");
    }
    @Override
    public void aim() {
        System.out.println("Gun: Aiming...in QBZ");
    }
    @Override
    public void switchMode() {
        System.out.println("Gun: Switching fire mode...in QBZ");
    }
    @Override
    public void inspect() {
        System.out.println("Gun: Inspecting weapon...in QBZ");
    }
}
