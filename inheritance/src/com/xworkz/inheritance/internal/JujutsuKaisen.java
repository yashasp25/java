package com.xworkz.inheritance.internal;

public class JujutsuKaisen extends Anime {
    public JujutsuKaisen() {
        super();
        System.out.println("Constructor in Jujutsu Kaisen");
    }
    @Override
    public void watch() {
        System.out.println("Watching anime...in JJK");
    }
    @Override
    public void review() {
        System.out.println("Reviewing the anime...in JJK");
    }
    @Override
    public void recommend() {
        System.out.println("Recommending the anime...in JJK");
    }
    @Override
    public void discuss() {
        System.out.println("Discussing anime theories...in JJK");
    }
    @Override
    public void collectMerchandise() {
        System.out.println("Collecting anime merchandise...in JJK");
    }

    public void useCursedTechnique() {
        System.out.println("Yuji uses a cursed technique.");
    }
}
