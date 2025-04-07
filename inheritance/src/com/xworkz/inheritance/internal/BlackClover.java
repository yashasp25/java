package com.xworkz.inheritance.internal;

public class BlackClover extends Anime {
    public BlackClover() {
        super();
        System.out.println("Constructor in Black Clover");
    }
    @Override
    public void watch() {
        System.out.println("Watching anime...in BC");
    }
    @Override
    public void review() {
        System.out.println("Reviewing the anime...in BC");
    }
    @Override
    public void recommend() {
        System.out.println("Recommending the anime...in BC");
    }
    @Override
    public void discuss() {
        System.out.println("Discussing anime theories...in BC");
    }
    @Override
    public void collectMerchandise() {
        System.out.println("Collecting anime merchandise...in BC");
    }

    public void summonMagicBook() {
        System.out.println("Asta summons his magic grimoire.");
    }
}
