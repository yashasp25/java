package com.xworkz.inheritance.internal;

public class Parasyte extends Anime {
    public Parasyte() {
        super();
        System.out.println("Constructor in Parasyte");
    }
    @Override
    public void watch() {
        System.out.println("Watching anime...in Parasyte");
    }
    @Override
    public void review() {
        System.out.println("Reviewing the anime...in Parasyte");
    }
    @Override
    public void recommend() {
        System.out.println("Recommending the anime...in Parasyte");
    }
    @Override
    public void discuss() {
        System.out.println("Discussing anime theories...in Parasyte");
    }
    @Override
    public void collectMerchandise() {
        System.out.println("Collecting anime merchandise...in Parasyte");
    }

}
