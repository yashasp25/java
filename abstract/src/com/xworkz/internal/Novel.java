package com.xworkz.internal;

public class Novel extends Book {
    Novel(String title, String author, int year) {
        super(title, author, year);
    }

    void showInfo() {
        System.out.println("Novel: " + title + " by " + author + ", published in " + year);
    }
}