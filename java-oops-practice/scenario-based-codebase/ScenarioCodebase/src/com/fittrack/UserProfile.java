package com.fittrack;

class UserProfile {
    private String name;
    private int age;
    private double weight; 
    private double dailyCalorieGoal;
    
    public UserProfile(String name, int age, double weight, double dailyCalorieGoal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dailyCalorieGoal = dailyCalorieGoal;
    }

    public UserProfile(String name, int age, double weight) {
        this(name, age, weight, 2000);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight > 0) {
            this.weight = weight;
        }
    }

    public double getDailyCalorieGoal() {
        return dailyCalorieGoal;
    }

    public void setDailyCalorieGoal(double dailyCalorieGoal) {
        this.dailyCalorieGoal = dailyCalorieGoal;
    }

    public String toString() {
        return "UserProfile [Name: " + name + ", Age: " + age + ", Weight: " + weight + "kg, Daily Calorie Goal: " + dailyCalorieGoal + "]";
    }
}

