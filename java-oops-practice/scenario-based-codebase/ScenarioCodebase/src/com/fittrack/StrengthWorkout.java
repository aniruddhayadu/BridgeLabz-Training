package com.fittrack;

public class StrengthWorkout extends Workout {

    public StrengthWorkout(double duration) {
        super("Strength", duration);
    }

    
    public void calculateCalories(double weight) {
        this.caloriesBurned = 6 * weight * (duration / 60);
    }
}