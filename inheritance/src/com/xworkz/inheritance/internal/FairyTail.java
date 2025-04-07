package com.xworkz.inheritance.internal;

public class FairyTail extends Anime {
    public FairyTail() {
        super();
        System.out.println("Constructor in Fairy Tail");
    }

    @Override
    public void watch() {
        System.out.println("Watching anime...in FT");
    }
    @Override
    public void review() {
        System.out.println("Reviewing the anime...in FT");
    }
    @Override
    public void recommend() {
        System.out.println("Recommending the anime...in FT");
    }
    @Override
    public void discuss() {
        System.out.println("Discussing anime theories...in FT");
    }
    @Override
    public void collectMerchandise() {
        System.out.println("Collecting anime merchandise...in FT");
    }
    public void useFireDragonMagic() {
        System.out.println("Natsu unleashes Fire Dragon magic.");
    }
}
