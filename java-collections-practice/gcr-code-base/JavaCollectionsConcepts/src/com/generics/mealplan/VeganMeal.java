package com.generics.mealplan;

class VeganMeal implements MealPlan {

	// Returns meal type
	public String getMealType() {
		return "Vegan";
	}

	// Returns calorie count
	public int getCalories() {
		return 1800;
	}
}
