package com.solvd.touragency.eurasiatour;

import com.solvd.touragency.worldtour.World;

public class Europe extends World {

	private String place;
	private int time;
	private int price;

	public Europe(){

	}
	public Europe(String place, int time){
		this.place = place;
		this.time = time;
	}
	public Europe(String place, int time, int price) {
		this.place = place;
		this.time = time;
		this.price = price;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getPlace() {
		return place;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getTime() {
		return time;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Europe{" +
				"place='" + place + '\'' +
				", time=" + time +
				", price=" + price +
				'}';
	}
}
