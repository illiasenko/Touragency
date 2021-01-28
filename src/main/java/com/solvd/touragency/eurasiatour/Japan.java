package com.solvd.touragency.eurasiatour;

public class Japan extends Asia {
	public Japan(){
		super();
	}
	@Override
	public void greetings(){
		super.greetings();
		System.out.println("Eat some sushi");
	}
}
