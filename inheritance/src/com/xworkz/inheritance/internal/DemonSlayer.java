package com.xworkz.inheritance.internal;

public class DemonSlayer extends Anime {
    public DemonSlayer() {
        super();
        System.out.println("Constructor in Demon Slayer");
    }

    @Override
    public void watch() {
        System.out.println("Watching anime...in Demon");
    }
    @Override
    public void review() {
        System.out.println("Reviewing the anime...in Demon");
    }
    @Override
    public void recommend() {
        System.out.println("Recommending the anime...in Demon");
    }
    @Override
    public void discuss() {
        System.out.println("Discussing anime theories...in Demon");
    }
    @Override
    public void collectMerchandise() {
        System.out.println("Collecting anime merchandise...in Demon");
    }
    public void useNichirinSword() {
        System.out.println("Tanjiro swings his Nichirin sword.");
    }
}
