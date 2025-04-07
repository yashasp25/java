package com.xworkz.inheritance.internal;

public class CodeGeass extends Anime {
    public CodeGeass() {
        super();
        System.out.println("Constructor in Code Geass");
    }

    @Override
    public void watch() {
        System.out.println("Watching anime...in CodeGeass");
    }
    @Override
    public void review() {
        System.out.println("Reviewing the anime...in CodeGeass");
    }
    @Override
    public void recommend() {
        System.out.println("Recommending the anime...in CodeGeass");
    }
    @Override
    public void discuss() {
        System.out.println("Discussing anime theories...in CodeGeass");
    }
    @Override
    public void collectMerchandise() {
        System.out.println("Collecting anime merchandise...in CodeGeass");
    }
    public void activateGeass() {
        System.out.println("Lelouch activates his Geass.");
    }
}
