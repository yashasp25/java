package com.xworkz.inheritance.internal;

public class S1897 extends Gun {
    public S1897() {
        super();
        System.out.println("Constructor in S1897");
    }

    @Override
    public void shoot() {
        System.out.println("Gun: Shooting...in S1897");
    }
    @Override
    public void reload() {
        System.out.println("Gun: Reloading...in S1897");
    }
    @Override
    public void aim() {
        System.out.println("Gun: Aiming...in S1897");
    }
    @Override
    public void switchMode() {
        System.out.println("Gun: Switching fire mode...in S1897");
    }
    @Override
    public void inspect() {
        System.out.println("Gun: Inspecting weapon...in S1897");
    }
    public void s1897Fire() {
        System.out.println("Firing with S1897.");
    }
}
