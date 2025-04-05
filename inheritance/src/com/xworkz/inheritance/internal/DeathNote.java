package com.xworkz.inheritance.internal;

public class DeathNote extends Anime {
    public DeathNote() {
        super();
        System.out.println("Constructor in Death Note");
    }
    @Override
    public void watch() {
        System.out.println("Watching anime...in DeathNote");
    }
    @Override
    public void review() {
        System.out.println("Reviewing the anime...in DeathNote");
    }
    @Override
    public void recommend() {
        System.out.println("Recommending the anime...in DeathNote");
    }
    @Override
    public void discuss() {
        System.out.println("Discussing anime theories...in DeathNote");
    }
    @Override
    public void collectMerchandise() {
        System.out.println("Collecting anime merchandise...in DeathNote");
    }
}
