package com.xworkz.country;

public class Personnel {
    String name;
    Skill skill;

    public Personnel(String name) {
        this.name = name;
        this.skill = new Skill("Administration Capability");
    }

    public void display() {
        System.out.println("Personnel: " + name);
        skill.display();
    }

    public static class PersonnelAssistant {
        String name;
        public PersonnelAssistant(String name){
            this.name=name;
            System.out.println("Personal Assistant details : ");
        }
        public void display(){
            System.out.println("I am a Personal Assistant of minister : "+name);
        }
    }
}