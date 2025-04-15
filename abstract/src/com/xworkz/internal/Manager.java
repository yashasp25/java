package com.xworkz.internal;

public class Manager extends Employee {
    Manager(String name) {
        super(name);
    }

    Manager(String name, String department) {
        super(name, department);
    }

    Manager(String name, String department, double salary, int experience) {
        super(name, department, salary, experience);
    }

    void details() {
        System.out.println("Manager: " + name + ", Dept: " + department + ", Salary: " + salary + ", Exp: " + experience + " yrs");
    }
}