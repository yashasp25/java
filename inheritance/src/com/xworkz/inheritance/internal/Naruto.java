package com.xworkz.inheritance.internal;

public class Naruto extends Anime {
    public Naruto() {
        super();
        System.out.println("Constructor in Naruto");
    }
    @Override
    public void watch() {
        System.out.println("Watching anime...in Naruto");
    }
    @Override
    public void review() {
        System.out.println("Reviewing the anime...in Naruto");
    }
    @Override
    public void recommend() {
        System.out.println("Recommending the anime...in Naruto");
    }
    @Override
    public void discuss() {
        System.out.println("Discussing anime theories...in Naruto");
    }
    @Override
    public void collectMerchandise() {
        System.out.println("Collecting anime merchandise...in Naruto");
    }
}
