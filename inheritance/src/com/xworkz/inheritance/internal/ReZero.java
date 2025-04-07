package com.xworkz.inheritance.internal;

public class ReZero extends Anime {
    public ReZero() {
        super();
        System.out.println("Constructor in Re:Zero");
    }

    @Override
    public void watch() {
        System.out.println("Watching anime...in ReZero");
    }
    @Override
    public void review() {
        System.out.println("Reviewing the anime...in ReZero");
    }
    @Override
    public void recommend() {
        System.out.println("Recommending the anime...in ReZero");
    }
    @Override
    public void discuss() {
        System.out.println("Discussing anime theories...in ReZero");
    }
    @Override
    public void collectMerchandise() {
        System.out.println("Collecting anime merchandise...in ReZero");
    }
    public void returnByDeath() {
        System.out.println("Subaru returns by death.");
    }
}
