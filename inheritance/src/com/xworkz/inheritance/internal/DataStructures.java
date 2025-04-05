package com.xworkz.inheritance.internal;

public class DataStructures extends Subject {
    public DataStructures() {
        super();
        System.out.println("Constructor in Data Structures");
    }
    @Override
    public void study() {
        System.out.println("Subject: Studying...in DS");
    }
    @Override
    public void takeExam() {
        System.out.println("Subject: Taking an exam...in DS");
    }
    @Override
    public void submitAssignment() {
        System.out.println("Subject: Submitting an assignment...in DS");
    }
    @Override
    public void discuss() {
        System.out.println("Subject: Discussing with peers...in DS");
    }
    @Override
    public void research() {
        System.out.println("Subject: Researching new topics...in DS");
    }
}
