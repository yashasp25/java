package com.xworkz.inheritance.internal;

public class OOPS extends Subject {
    public OOPS() {
        super();
        System.out.println("Constructor in OOPS");
    }

    @Override
    public void study() {
        System.out.println("Subject: Studying...in OOPs");
    }
    @Override
    public void takeExam() {
        System.out.println("Subject: Taking an exam...in OOPs");
    }
    @Override
    public void submitAssignment() {
        System.out.println("Subject: Submitting an assignment...in OOPs");
    }
    @Override
    public void discuss() {
        System.out.println("Subject: Discussing with peers...in OOPs");
    }
    @Override
    public void research() {
        System.out.println("Subject: Researching new topics...in OOPs");
    }
}
