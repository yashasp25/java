package com.xworkz.inheritance.internal;

public class SwordArtOnline extends Anime {
    public SwordArtOnline() {
        super();
        System.out.println("Constructor in Sword Art Online");
    }

    @Override
    public void watch() {
        System.out.println("Watching anime...in SAO");
    }

    @Override
    public void review() {
        System.out.println("Reviewing the anime...in SAO");
    }

    @Override
    public void recommend() {
        System.out.println("Recommending the anime...in SAO");
    }

    @Override
    public void discuss() {
        System.out.println("Discussing anime theories...in SAO");
    }

    @Override
    public void collectMerchandise() {
        System.out.println("Collecting anime merchandise...in SAO");
    }

    public void equipLegendarySword() {
        System.out.println("Kirito equips his legendary sword.");
    }
}