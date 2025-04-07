package com.xworkz.inheritance.internal;

public class Groza extends Gun {
    public Groza() {
        super();
        System.out.println("Constructor in Groza");
    }

    @Override
    public void shoot() {
        System.out.println("Gun: Shooting...in Groza");
    }
    @Override
    public void reload() {
        System.out.println("Gun: Reloading...in Groza");
    }
    @Override
    public void aim() {
        System.out.println("Gun: Aiming...in Groza");
    }
    @Override
    public void switchMode() {
        System.out.println("Gun: Switching fire mode...in Groza");
    }
    @Override
    public void inspect() {
        System.out.println("Gun: Inspecting weapon...in Groza");
    }
    public void grozaFire() {
        System.out.println("Firing with Groza.");
    }
}
