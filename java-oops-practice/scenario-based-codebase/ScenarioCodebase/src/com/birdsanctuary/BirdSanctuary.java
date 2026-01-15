package com.birdsanctuary;

import java.util.ArrayList;

public class BirdSanctuary {

private ArrayList<Bird> birds = new ArrayList<>();

public void addBird(Bird bird) {
   birds.add(bird);
   System.out.println("Bird added successfully.");
}

public void displayAllBirds() {
   for (Bird bird : birds) {
       bird.displayInfo(); 
       bird.eat();         
   }
}
public void displayFlyingBirds() {
   for (Bird bird : birds) {
       if (bird instanceof Flyable) {
           ((Flyable) bird).fly();
       }
   }
}

public void displaySwimmingBirds() {
   for (Bird bird : birds) {
       if (bird instanceof Swimmable) {
           ((Swimmable) bird).swim(); 
       }
   }
}

public void displayBothFlyAndSwim() {
   for (Bird bird : birds) {
       if (bird instanceof Flyable && bird instanceof Swimmable) {
           bird.displayInfo();
       }
   }
}

public void removeBirdById(String id) {
   birds.removeIf(bird -> bird.getId().equals(id));
   System.out.println("Bird removed if ID matched.");
}

public void sanctuaryReport() {
   int fly = 0, swim = 0, both = 0, neither = 0;

   for (Bird bird : birds) {
       boolean canFly = bird instanceof Flyable;
       boolean canSwim = bird instanceof Swimmable;

       if (canFly && canSwim) both++;
       else if (canFly) fly++;
       else if (canSwim) swim++;
       else neither++;
   }

   System.out.println("----- Sanctuary Report -----");
   System.out.println("Flyable Birds: " + fly);
   System.out.println("Swimmable Birds: " + swim);
   System.out.println("Both Fly & Swim: " + both);
   System.out.println("Neither: " + neither);
}
}