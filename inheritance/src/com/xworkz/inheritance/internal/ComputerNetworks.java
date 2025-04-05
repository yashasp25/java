package com.xworkz.inheritance.internal;

public class ComputerNetworks extends Subject {
    public ComputerNetworks() {
        super();
        System.out.println("Constructor in Computer Networks");
    }

    @Override
    public void study() {
        System.out.println("Subject: Studying...in CN");
    }
    @Override
    public void takeExam() {
        System.out.println("Subject: Taking an exam...in CN");
    }
    @Override
    public void submitAssignment() {
        System.out.println("Subject: Submitting an assignment...in CN");
    }
    @Override
    public void discuss() {
        System.out.println("Subject: Discussing with peers...in CN");
    }
    @Override
    public void research() {
        System.out.println("Subject: Researching new topics...in CN");
    }
}
