package com.xworkz.country;

import com.xworkz.administration.House;
import com.xworkz.geography.State;

    public class Minister {
        String name;
        Portfolio[] portfolios;
        House house;
        Security security;
        State[] states;
        PersonnelAssistant personnelAssistant;

        public Minister(String name) {
            this.name = name;
            this.portfolios = new Portfolio[]{new Portfolio("Chief Minister")};
            this.house = new House();
            this.personnelAssistant = new PersonnelAssistant("Siddharamiah");
            this.security = new Security();
            this.states = new State[]{new State("Karnataka")};
        }

        public void display() {
            System.out.println("  Minister: " + name);
            for (Portfolio portfolio : portfolios) {
                portfolio.display();
            }
            house.display();
            personnelAssistant.display();
            security.display();
            for (State state : states) {
                state.display();
            }
        }
    }

