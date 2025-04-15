package com.xworkz.internal;

public abstract class Employee {
    String name;
    String department;
    double salary;
    int experience;

    Employee(String name) {
        this.name = name;
    }

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    Employee(String name, String department, double salary, int experience) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.experience = experience;
    }
}
