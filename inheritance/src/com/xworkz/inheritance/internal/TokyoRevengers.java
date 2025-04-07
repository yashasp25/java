package com.xworkz.inheritance.internal;

public class TokyoRevengers extends Anime {
    public TokyoRevengers() {
        super();
        System.out.println("Constructor in Tokyo Revengers");
    }

    @Override
    public void watch() {
        System.out.println("Watching anime...in TR");
    }
    @Override
    public void review() {
        System.out.println("Reviewing the anime...in TR");
    }
    @Override
    public void recommend() {
        System.out.println("Recommending the anime...in TR");
    }
    @Override
    public void discuss() {
        System.out.println("Discussing anime theories...in TR");
    }
    @Override
    public void collectMerchandise() {
        System.out.println("Collecting anime merchandise...in TR");
    }
    public void timeTravel() {
        System.out.println("Takemichi travels back in time.");
    }
}
