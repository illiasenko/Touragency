package com.solvd.touragency.additional;

public class Additional {

	private String drink;
	private String food;

	public Additional(String food_for_free) {
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public String getDrink() {
		return this.drink;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getFood() {
		return this.food;
	}
	public void dinner () throws MyException{
		if (drink == null || food == null || drink.isEmpty() || food.isEmpty()) {
			throw new MyException("You need to pay the bill");
		}
		System.out.println("All inclusive");

	}
}

