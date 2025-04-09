package com.xworkz.inheritance.internal;

public class Anime {

    private int time;
    private int episodes;
    private String genre;

    public Anime(int time,int episodes,String genre) {
        this.time=time;
        this.episodes=episodes;
        this.genre = genre;
        System.out.println("Constructor of anime");
    }

    public void watch() {
        System.out.println("Watching anime...");
    }

    public void review() {
        System.out.println("Reviewing the anime...");
    }

    public void recommend() {
        System.out.println("Recommending the anime...");
    }

    public void discuss() {
        System.out.println("Discussing anime theories...");
    }

    public void collectMerchandise() {
        System.out.println("Collecting anime merchandise...");
    }
}
