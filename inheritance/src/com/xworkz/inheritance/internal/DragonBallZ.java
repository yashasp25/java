package com.xworkz.inheritance.internal;

public class DragonBallZ extends Anime {
    public DragonBallZ() {
        super();
        System.out.println("Constructor in Dragon Ball Z");
    }

    @Override
    public void watch() {
        System.out.println("Watching anime...in DBZ");
    }
    @Override
    public void review() {
        System.out.println("Reviewing the anime...in DBZ");
    }
    @Override
    public void recommend() {
        System.out.println("Recommending the anime...in DBZ");
    }
    @Override
    public void discuss() {
        System.out.println("Discussing anime theories...in DBZ");
    }
    @Override
    public void collectMerchandise() {
        System.out.println("Collecting anime merchandise...in DBZ");
    }

    public void kamehameha() {
        System.out.println("Goku launches a Kamehameha wave.");
    }
}
