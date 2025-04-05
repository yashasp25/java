package com.xworkz.inheritance.internal;

public class FullmetalAlchemist extends Anime {
    public FullmetalAlchemist() {
        super();
        System.out.println("Constructor in Fullmetal Alchemist");
    }

    @Override
    public void watch() {
        System.out.println("Watching anime...in FA");
    }
    @Override
    public void review() {
        System.out.println("Reviewing the anime...in FA");
    }
    @Override
    public void recommend() {
        System.out.println("Recommending the anime...in FA");
    }
    @Override
    public void discuss() {
        System.out.println("Discussing anime theories...in FA");
    }
    @Override
    public void collectMerchandise() {
        System.out.println("Collecting anime merchandise...in FA");
    }
}
