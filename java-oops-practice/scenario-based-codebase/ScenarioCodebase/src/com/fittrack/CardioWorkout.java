package com.fittrack;

public class CardioWorkout extends Workout {

    public CardioWorkout(double duration) {
        super("Cardio", duration);
    }

    
    public void calculateCalories(double weight) {
        this.caloriesBurned = 8 * weight * (duration / 60);
    }
}