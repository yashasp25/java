package com.xworkz.inheritance.internal;

public class CowboyBebop extends Anime {
    public CowboyBebop() {
        super();
        System.out.println("Constructor in Cowboy Bebop");
    }

    @Override
    public void watch() {
        System.out.println("Watching anime...in CWB");
    }
    @Override
    public void review() {
        System.out.println("Reviewing the anime...in CWB");
    }
    @Override
    public void recommend() {
        System.out.println("Recommending the anime...in CWB");
    }
    @Override
    public void discuss() {
        System.out.println("Discussing anime theories...in CWB");
    }
    @Override
    public void collectMerchandise() {
        System.out.println("Collecting anime merchandise...in CWB");
    }
}
