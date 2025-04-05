package com.xworkz.inheritance.internal;

public class MyHeroAcademia extends Anime {
    public MyHeroAcademia() {
        super();
        System.out.println("Constructor in My Hero Academia");
    }
    @Override
    public void watch() {
        System.out.println("Watching anime...in MHA");
    }
    @Override
    public void review() {
        System.out.println("Reviewing the anime...in MHA");
    }
    @Override
    public void recommend() {
        System.out.println("Recommending the anime...in MHA");
    }
    @Override
    public void discuss() {
        System.out.println("Discussing anime theories...in MHA");
    }
    @Override
    public void collectMerchandise() {
        System.out.println("Collecting anime merchandise...in MHA");
    }
}
