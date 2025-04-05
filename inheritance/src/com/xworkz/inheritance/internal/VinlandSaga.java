package com.xworkz.inheritance.internal;

public class VinlandSaga extends Anime {
    public VinlandSaga() {
        super();
        System.out.println("Constructor in Vinland Saga");
    }

    @Override
    public void watch() {
        System.out.println("Watching anime...in VinlandSaga");
    }
    @Override
    public void review() {
        System.out.println("Reviewing the anime...in VinlandSaga");
    }
    @Override
    public void recommend() {
        System.out.println("Recommending the anime...in VinlandSaga");
    }
    @Override
    public void discuss() {
        System.out.println("Discussing anime theories...in VinlandSaga");
    }
    @Override
    public void collectMerchandise() {
        System.out.println("Collecting anime merchandise...in VinlandSaga");
    }
}
