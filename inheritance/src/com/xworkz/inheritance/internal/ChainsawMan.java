package com.xworkz.inheritance.internal;

public class ChainsawMan extends Anime {
    public ChainsawMan() {
        super();
        System.out.println("Constructor in Chainsaw Man");
    }

    @Override
    public void watch() {
        System.out.println("Watching anime...in Chainsaw");
    }
    @Override
    public void review() {
        System.out.println("Reviewing the anime...in Chainsaw");
    }
    @Override
    public void recommend() {
        System.out.println("Recommending the anime...in Chainsaw");
    }
    @Override
    public void discuss() {
        System.out.println("Discussing anime theories...in Chainsaw");
    }
    @Override
    public void collectMerchandise() {
        System.out.println("Collecting anime merchandise...in Chainsaw");
    }
    public void chainsawTransform() {
        System.out.println("Denji transforms into Chainsaw Man.");
    }
}
