package com.xworkz.inheritance.internal;

public class OnePiece extends Anime {
    public OnePiece() {
        super();
        System.out.println("Constructor in One Piece");
    }

    @Override
    public void watch() {
        System.out.println("Watching anime...in OP");
    }
    @Override
    public void review() {
        System.out.println("Reviewing the anime...in OP");
    }
    @Override
    public void recommend() {
        System.out.println("Recommending the anime...in OP");
    }
    @Override
    public void discuss() {
        System.out.println("Discussing anime theories...in OP");
    }
    @Override
    public void collectMerchandise() {
        System.out.println("Collecting anime merchandise...in OP");
    }

    public void findOnePiece() {
        System.out.println("Finding the legendary One Piece treasure...");
    }
}
