package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.internal.*;

public class AnimalRunner {
    public static void main(String[] args) {

        Animal animal = new Animal(70,4,"skin");
        System.out.println("Animal : "+animal.toString());

        animal.eat();
        animal.sleep();
        animal.makeSound();
        animal.move();
        animal.breathe();

        Animal animal1 = new Dog();
        animal1.eat();
        animal1.sleep();
        animal1.makeSound();
        animal1.move();
        animal1.breathe();

        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.makeSound();
        dog.move();
        dog.breathe();

        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
        cat.makeSound();
        cat.move();
        cat.breathe();

        Elephant elephant = new Elephant();
        elephant.eat();
        elephant.sleep();
        elephant.makeSound();
        elephant.move();
        elephant.breathe();

        Lion lion = new Lion();
        lion.eat();
        lion.sleep();
        lion.makeSound();
        lion.move();
        lion.breathe();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.sleep();
        tiger.makeSound();
        tiger.move();
        tiger.breathe();

        Horse horse = new Horse();
        horse.eat();
        horse.sleep();
        horse.makeSound();
        horse.move();
        horse.breathe();

        Monkey monkey = new Monkey();
        monkey.eat();
        monkey.sleep();
        monkey.makeSound();
        monkey.move();
        monkey.breathe();

        Dolphin dolphin = new Dolphin();
        dolphin.eat();
        dolphin.sleep();
        dolphin.makeSound();
        dolphin.move();
        dolphin.breathe();

        Eagle eagle = new Eagle();
        eagle.eat();
        eagle.sleep();
        eagle.makeSound();
        eagle.move();
        eagle.breathe();
        Snake snake = new Snake();
        snake.eat();
        snake.sleep();
        snake.makeSound();
        snake.move();
        snake.breathe();
    }
}
