package com.xworkz.internal;

public abstract class Book {
    String title;
    String author;
    int year;

    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
}
