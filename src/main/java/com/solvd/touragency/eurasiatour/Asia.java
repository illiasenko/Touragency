package com.solvd.touragency.eurasiatour;

import com.solvd.touragency.worldtour.World;

public abstract class Asia extends World implements Bonus {

	public Asia() {

	}
	@Override
	public boolean getBonuses() {
		return false;
	}
	public void greetings() {
		System.out.println("Greetings from Asia");
	}
}