package com.xworkz.inheritance.internal;

public class WebDevelopment extends Subject {
    public WebDevelopment() {
        super();
        System.out.println("Constructor in Web Development");
    }
    @Override
    public void study() {
        System.out.println("Subject: Studying...in web");
    }
    @Override
    public void takeExam() {
        System.out.println("Subject: Taking an exam...in web");
    }
    @Override
    public void submitAssignment() {
        System.out.println("Subject: Submitting an assignment...in web");
    }
    @Override
    public void discuss() {
        System.out.println("Subject: Discussing with peers...in web");
    }
    @Override
    public void rewebarch() {
        System.out.println("Subject: Rewebarching new topics...in web");
    }
}
