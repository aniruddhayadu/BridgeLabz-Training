package com.PetPal;
import java.util.Random;

public abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;
    
    
    private int hunger;   
    private int energy;   
    private String mood;

    protected Random random = new Random();

    
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = random.nextInt(40) + 30;
        this.energy = random.nextInt(40) + 30;
        updateMood();
    }

    protected void changeHunger(int value) {
        hunger = Math.max(0, Math.min(100, hunger + value));
        updateMood();
    }

    protected void changeEnergy(int value) {
        energy = Math.max(0, Math.min(100, energy + value));
        updateMood();
    }

    private void updateMood() {
        if (hunger > 70)
            mood = "Hungry";
        else if (energy < 30)
            mood = "Tired";
        else
            mood = "Happy";
    }

    public void showStatus() {
        System.out.println(" Pet Status Card ");
        System.out.println("---------------------");
        System.out.println("Name   : " + name);
        System.out.println("Type   : " + type);
        System.out.println("Age    : " + age);
        System.out.println("Mood   : " + mood);
        System.out.println("---------------------");
    }

    public abstract void makeSound();
}
