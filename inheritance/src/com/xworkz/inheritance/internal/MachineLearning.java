package com.xworkz.inheritance.internal;

public class MachineLearning extends Subject {
    public MachineLearning() {
        super();
        System.out.println("Constructor in Machine Learning");
    }
    @Override
    public void study() {
        System.out.println("Subject: Studying...in ML");
    }
    @Override
    public void takeExam() {
        System.out.println("Subject: Taking an exam...in ML");
    }
    @Override
    public void submitAssignment() {
        System.out.println("Subject: Submitting an assignment...in ML");
    }
    @Override
    public void discuss() {
        System.out.println("Subject: Discussing with peers...in ML");
    }
    @Override
    public void research() {
        System.out.println("Subject: Researching new topics...in ML");
    }
}
