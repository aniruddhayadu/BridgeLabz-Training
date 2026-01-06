package com.PetPal;

public class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

    public void feed() {
        System.out.println(name + " is eating fish ");
        changeHunger(-15);
    }

    public void play() {
        System.out.println(name + " is chasing a laser ");
        changeEnergy(-10);
        changeHunger(8);
    }

    public void sleep() {
        System.out.println(name + " is napping on a couch ");
        changeEnergy(20);
    }

    public void makeSound() {
        System.out.println(name + " says: Meow! ");
    }
}