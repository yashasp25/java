package com.xworkz.inheritance.internal;

public class Bleach extends Anime {
    public Bleach() {
        super();
        System.out.println("Constructor in Bleach");
    }

    @Override
    public void watch() {
        System.out.println("Watching anime...in Bleach");
    }
    @Override
    public void review() {
        System.out.println("Reviewing the anime...in Bleach");
    }
    @Override
    public void recommend() {
        System.out.println("Recommending the anime...in Bleach");
    }
    @Override
    public void discuss() {
        System.out.println("Discussing anime theories...in Bleach");
    }
    @Override
    public void collectMerchandise() {
        System.out.println("Collecting anime merchandise...in Bleach");
    }
    public void useBankai() {
        System.out.println("Ichigo activates his Bankai.");
    }
}
