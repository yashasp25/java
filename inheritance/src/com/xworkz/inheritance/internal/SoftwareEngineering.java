package com.xworkz.inheritance.internal;

public class SoftwareEngineering extends Subject {
    public SoftwareEngineering() {
        super();
        System.out.println("Constructor in Software Engineering");
    }

    @Override
    public void study() {
        System.out.println("Subject: Studying...in SE");
    }
    @Override
    public void takeExam() {
        System.out.println("Subject: Taking an exam...in SE");
    }
    @Override
    public void submitAssignment() {
        System.out.println("Subject: Submitting an assignment...in SE");
    }
    @Override
    public void discuss() {
        System.out.println("Subject: Discussing with peers...in SE");
    }
    @Override
    public void research() {
        System.out.println("Subject: Researching new topics...in SE");
    }
}
