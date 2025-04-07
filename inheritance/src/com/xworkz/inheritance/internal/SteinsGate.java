package com.xworkz.inheritance.internal;

public class SteinsGate extends Anime {
    public SteinsGate() {
        super();
        System.out.println("Constructor in Steins;Gate");
    }

    @Override
    public void watch() {
        System.out.println("Watching anime...in StiensGate");
    }
    @Override
    public void review() {
        System.out.println("Reviewing the anime...in StiensGate");
    }
    @Override
    public void recommend() {
        System.out.println("Recommending the anime...in StiensGate");
    }
    @Override
    public void discuss() {
        System.out.println("Discussing anime theories...in StiensGate");
    }
    @Override
    public void collectMerchandise() {
        System.out.println("Collecting anime merchandise...in StiensGate");
    }
    public void hackTimeLine() {
        System.out.println("Okabe hacks the timeline.");
    }
}
