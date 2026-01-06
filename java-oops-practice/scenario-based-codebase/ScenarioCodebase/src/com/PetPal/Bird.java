package com.PetPal;

public class Bird extends Pet {

    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    public void feed() {
        System.out.println(name + " is eating seeds ");
        changeHunger(-10);
    }

    public void play() {
        System.out.println(name + " is flying around ");
        changeEnergy(-20);
        changeHunger(12);
    }

    public void sleep() {
        System.out.println(name + " is resting in its nest ");
        changeEnergy(30);
    }

    public void makeSound() {
        System.out.println(name + " says: Tweet! ");
    }
}
