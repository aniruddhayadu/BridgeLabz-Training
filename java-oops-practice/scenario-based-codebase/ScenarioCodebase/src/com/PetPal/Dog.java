package com.PetPal;

public class Dog extends Pet {

    public Dog(String name, int age) {
        super(name, "Dog", age);
    }

    public void feed() {
        System.out.println(name + " is eating dog food ");
        changeHunger(-20);
    }

    public void play() {
        System.out.println(name + " is playing fetch ");
        changeEnergy(-15);
        changeHunger(10);
    }

    public void sleep() {
        System.out.println(name + " is sleeping peacefully ");
        changeEnergy(25);
    }

    public void makeSound() {
        System.out.println(name + " says: Woof ");
    }
}
