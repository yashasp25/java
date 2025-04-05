package com.xworkz.inheritance.internal;

public class DBMS extends Subject {
    public DBMS() {
        super();
        System.out.println("Constructor in DBMS");
    }
    @Override
    public void study() {
        System.out.println("Subject: Studying...in DBMS");
    }
    @Override
    public void takeExam() {
        System.out.println("Subject: Taking an exam...in DBMS");
    }
    @Override
    public void submitAssignment() {
        System.out.println("Subject: Submitting an assignment...in DBMS");
    }
    @Override
    public void discuss() {
        System.out.println("Subject: Discussing with peers...in DBMS");
    }
    @Override
    public void research() {
        System.out.println("Subject: Researching new topics...in DBMS");
    }
}
