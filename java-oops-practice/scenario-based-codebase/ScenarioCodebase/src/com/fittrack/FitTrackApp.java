package com.fittrack;

public class FitTrackApp {
    public static void main(String[] args) {
        UserProfile user1 = new UserProfile("Alice", 25, 60);
        System.out.println(user1);

        Workout cardio = new CardioWorkout(45);
        Workout strength = new StrengthWorkout(30); 

        cardio.startWorkout();
        cardio.calculateCalories(user1.getWeight());
        cardio.stopWorkout();
        System.out.println("Remaining calories for today: " + cardio.remainingCalories(user1.getDailyCalorieGoal()));

        strength.startWorkout();
        strength.calculateCalories(user1.getWeight());
        strength.stopWorkout();
        System.out.println("Remaining calories for today: " + strength.remainingCalories(user1.getDailyCalorieGoal()));

        double totalBurned = cardio.caloriesBurned + strength.caloriesBurned;
        double remaining = user1.getDailyCalorieGoal() - totalBurned;
        System.out.println("Total calories burned today: " + totalBurned);
        System.out.println("Calories remaining to reach goal: " + remaining);
    }
}


