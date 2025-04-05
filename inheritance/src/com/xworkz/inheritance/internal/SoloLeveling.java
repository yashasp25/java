package com.xworkz.inheritance.internal;

public class SoloLeveling extends Anime{
        public SoloLeveling() {
            super();
            System.out.println("Constructor in Solo Leveling");
        }

    @Override
    public void watch() {
        System.out.println("Watching anime...in SoloLeveling");
    }
    @Override
    public void review() {
        System.out.println("Reviewing the anime...in SoloLeveling");
    }
    @Override
    public void recommend() {
        System.out.println("Recommending the anime...in SoloLeveling");
    }
    @Override
    public void discuss() {
        System.out.println("Discussing anime theories...in SoloLeveling");
    }
    @Override
    public void collectMerchandise() {
        System.out.println("Collecting anime merchandise...in SoloLeveling");
    }
    }
