package com.xworkz.inheritance.internal;

public class S686 extends Gun {
    public S686() {
        super();
        System.out.println("Constructor in S686");
    }

    @Override
    public void shoot() {
        System.out.println("Gun: Shooting...in S686");
    }
    @Override
    public void reload() {
        System.out.println("Gun: Reloading...in S686");
    }
    @Override
    public void aim() {
        System.out.println("Gun: Aiming...in S686");
    }
    @Override
    public void switchMode() {
        System.out.println("Gun: Switching fire mode...in S686");
    }
    @Override
    public void inspect() {
        System.out.println("Gun: Inspecting weapon...in S686");
    }
}
