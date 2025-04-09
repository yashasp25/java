package com.xworkz.inheritance.internal;

public class AttackOnTitan extends Anime {

    private int time;
    private int episodes;
    private String genre;

    public AttackOnTitan() {
        super();
        System.out.println("Constructor in Attack on Titan");
    }
    @Override
    public void watch() {
        System.out.println("Watching anime...in AOT");
    }
    @Override
    public void review() {
        System.out.println("Reviewing the anime...in AOT");
    }
    @Override
    public void recommend() {
        System.out.println("Recommending the anime...in AOT");
    }
    @Override
    public void discuss() {
        System.out.println("Discussing anime theories...in AOT");
    }
    @Override
    public void collectMerchandise() {
        System.out.println("Collecting anime merchandise...in AOT");
    }
    public void transformTitan() {
        System.out.println("Eren transforms into a Titan.");
    }
}
