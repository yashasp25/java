package com.xworkz.inheritance.internal;

public class HunterXHunter extends Anime {
    public HunterXHunter() {
        super();
        System.out.println("Constructor in Hunter X Hunter");
    }

    @Override
    public void watch() {
        System.out.println("Watching anime...in HXH");
    }
    @Override
    public void review() {
        System.out.println("Reviewing the anime...in HXH");
    }
    @Override
    public void recommend() {
        System.out.println("Recommending the anime...in HXH");
    }
    @Override
    public void discuss() {
        System.out.println("Discussing anime theories...in HXH");
    }
    @Override
    public void collectMerchandise() {
        System.out.println("Collecting anime merchandise...in HXH");
    }
}
