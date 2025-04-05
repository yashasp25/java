package com.xworkz.inheritance.internal;

public class AI extends Subject {
    public AI() {
        super();
        System.out.println("Constructor in AI");
    }

    @Override
    public void study() {
        System.out.println("Subject: Studying...in AI");
    }
    @Override
    public void takeExam() {
        System.out.println("Subject: Taking an exam...in AI");
    }
    @Override
    public void submitAssignment() {
        System.out.println("Subject: Submitting an assignment...in AI");
    }
    @Override
    public void discuss() {
        System.out.println("Subject: Discussing with peers...in AI");
    }
    @Override
    public void research() {
        System.out.println("Subject: Researching new topics...in AI");
    }
}
