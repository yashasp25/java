package com.xworkz.internal;

class Novel extends Book {
    Novel(String title, String author, int year) {
        super(title, author, year);
    }

    void showInfo() {
        System.out.println("Novel: " + title + " by " + author + ", published in " + year);
    }
}