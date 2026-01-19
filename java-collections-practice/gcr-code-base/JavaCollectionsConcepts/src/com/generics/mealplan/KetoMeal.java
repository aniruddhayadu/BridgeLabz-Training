package com.generics.mealplan;

class KetoMeal implements MealPlan {

	// Returns meal type
	public String getMealType() {
		return "Keto";
	}

	// Returns calorie count
	public int getCalories() {
		return 2200;
	}
}
