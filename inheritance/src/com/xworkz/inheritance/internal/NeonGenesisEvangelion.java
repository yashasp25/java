package com.xworkz.inheritance.internal;

public class NeonGenesisEvangelion extends Anime {
    public NeonGenesisEvangelion() {
        super();
        System.out.println("Constructor in Neon Genesis Evangelion");
    }

    @Override
    public void watch() {
        System.out.println("Watching anime...in NGE");
    }
    @Override
    public void review() {
        System.out.println("Reviewing the anime...in NGE");
    }
    @Override
    public void recommend() {
        System.out.println("Recommending the anime...in NGE");
    }
    @Override
    public void discuss() {
        System.out.println("Discussing anime theories...in NGE");
    }
    @Override
    public void collectMerchandise() {
        System.out.println("Collecting anime merchandise...in NGE");
    }
}
