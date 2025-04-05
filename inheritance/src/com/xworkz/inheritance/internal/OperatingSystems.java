package com.xworkz.inheritance.internal;

public class OperatingSystems extends Subject {
    public OperatingSystems() {
        super();
        System.out.println("Constructor in Operating Systems");
    }
    @Override
    public void study() {
        System.out.println("Subject: Studying...in os");
    }
    @Override
    public void takeExam() {
        System.out.println("Subject: Taking an exam...in os");
    }
    @Override
    public void submitAssignment() {
        System.out.println("Subject: Submitting an assignment...in os");
    }
    @Override
    public void discuss() {
        System.out.println("Subject: Discussing with peers...in os");
    }
    @Override
    public void research() {
        System.out.println("Subject: Researching new topics...in os");
    }
}
