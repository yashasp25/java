package com.xworkz.inheritance.internal;

public class G36C extends Gun {
    public G36C() {
        super();
        System.out.println("Constructor in G36C");
    }

    @Override
    public void shoot() {
        System.out.println("Gun: Shooting...in G36C");
    }
    @Override
    public void reload() {
        System.out.println("Gun: Reloading...in G36C");
    }
    @Override
    public void aim() {
        System.out.println("Gun: Aiming...in G36C");
    }
    @Override
    public void switchMode() {
        System.out.println("Gun: Switching fire mode...in G36C");
    }
    @Override
    public void inspect() {
        System.out.println("Gun: Inspecting weapon...in G36C");
    }
}
