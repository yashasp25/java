package com.xworkz.inheritance.internal;

public class Algorithms extends Subject {
    public Algorithms() {
        super();
        System.out.println("Constructor in Algorithms");
    }
    @Override
    public void study() {
        System.out.println("Subject: Studying...in Algorithms");
    }
    @Override
    public void takeExam() {
        System.out.println("Subject: Taking an exam...in Algorithms");
    }
    @Override
    public void submitAssignment() {
        System.out.println("Subject: Submitting an assignment...in Algorithms");
    }
    @Override
    public void discuss() {
        System.out.println("Subject: Discussing with peers...in Algorithms");
    }
    @Override
    public void research() {
        System.out.println("Subject: Researching new topics...in Algorithms");
    }
}
