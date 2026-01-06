package com.fittrack;

abstract class Workout implements ITrackable {
    protected String type;
    protected double duration; // in minutes
    protected double caloriesBurned;

    public Workout(String type, double duration) {
        this.type = type;
        this.duration = duration;
        this.caloriesBurned = 0;
    }

    public abstract void calculateCalories(double weight);

    public void startWorkout() {
        System.out.println(type + " workout started!");
    }

    public void stopWorkout() {
        System.out.println(type + " workout stopped. Calories burned: " + caloriesBurned);
    }

    public double remainingCalories(double dailyTarget) {
        return dailyTarget - caloriesBurned;
    }

    public String toString() {
        return type + " Workout [Duration: " + duration + " mins, Calories Burned: " + caloriesBurned + "]";
    }
}

