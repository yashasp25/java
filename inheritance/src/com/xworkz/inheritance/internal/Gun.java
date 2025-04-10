package com.xworkz.inheritance.internal;

public class Gun {
    int ammo;
    String type;
    int size;
    public Gun(int ammo,String type,int size) {
        this.ammo=ammo;
        this.type=type;
        this.size=size;
        System.out.println("Constructor in Gun");
    }

    public void shoot() {
        System.out.println("Gun: Shooting...");
    }

    public void reload() {
        System.out.println("Gun: Reloading...");
    }

    public void aim() {
        System.out.println("Gun: Aiming...");
    }

    public void switchMode() {
        System.out.println("Gun: Switching fire mode...");
    }

    public void inspect() {
        System.out.println("Gun: Inspecting weapon...");
    }
}
