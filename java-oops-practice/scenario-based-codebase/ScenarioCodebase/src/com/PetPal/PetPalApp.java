package com.PetPal;

public class PetPalApp {

    public static void main(String[] args) {

        System.out.println(" Welcome to PetPal ");

        Pet dog = new Dog("Tom", 3);
        Pet cat = new Cat("Princi", 2);
        Pet bird = new Bird("Chidiya", 1);

        // Polymorphism in action
        dog.makeSound();
        dog.play();
        dog.feed();
        dog.showStatus();

        cat.makeSound();
        cat.sleep();
        cat.showStatus();

        bird.makeSound();
        bird.play();
        bird.feed();
        bird.showStatus();

        System.out.println("\n Thank you");
    }
}