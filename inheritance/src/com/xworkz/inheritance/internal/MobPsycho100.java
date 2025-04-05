package com.xworkz.inheritance.internal;

public class MobPsycho100 extends Anime {
    public MobPsycho100() {
        super();
        System.out.println("Constructor in Mob Psycho 100");
    }

    @Override
    public void watch() {
        System.out.println("Watching anime...in MP100");
    }
    @Override
    public void review() {
        System.out.println("Reviewing the anime...in MP100");
    }
    @Override
    public void recommend() {
        System.out.println("Recommending the anime...in MP100");
    }
    @Override
    public void discuss() {
        System.out.println("Discussing anime theories...in MP100");
    }
    @Override
    public void collectMerchandise() {
        System.out.println("Collecting anime merchandise...in MP100");
    }
}
