package com.xworkz.inheritance.internal;

public class OnePunchMan extends Anime {
    public OnePunchMan() {
        super();
        System.out.println("Constructor in One Punch Man");
    }
    @Override
    public void watch() {
        System.out.println("Watching anime...in OPM");
    }
    @Override
    public void review() {
        System.out.println("Reviewing the anime...in OPM");
    }
    @Override
    public void recommend() {
        System.out.println("Recommending the anime...in OPM");
    }
    @Override
    public void discuss() {
        System.out.println("Discussing anime theories...in OPM");
    }
    @Override
    public void collectMerchandise() {
        System.out.println("Collecting anime merchandise...in OPM");
    }
}
