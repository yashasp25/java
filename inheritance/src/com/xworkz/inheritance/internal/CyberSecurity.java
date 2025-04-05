package com.xworkz.inheritance.internal;

public class CyberSecurity extends Subject {
    public CyberSecurity() {
        super();
        System.out.println("Constructor in Cyber Security");
    }
    @Override
    public void study() {
        System.out.println("Subject: Studying...in CS");
    }
    @Override
    public void takeExam() {
        System.out.println("Subject: Taking an exam...in CS");
    }
    @Override
    public void submitAssignment() {
        System.out.println("Subject: Submitting an assignment...in CS");
    }
    @Override
    public void discuss() {
        System.out.println("Subject: Discussing with peers...in CS");
    }
    @Override
    public void research() {
        System.out.println("Subject: Researching new topics...in CS");
    }
}
