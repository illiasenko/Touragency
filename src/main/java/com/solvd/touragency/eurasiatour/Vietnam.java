package com.solvd.touragency.eurasiatour;

public class Vietnam extends Asia {

	private String place;
	private int time;
	private int price;

	public Vietnam() {
	}

	public Vietnam(String place, int time, int price) {
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTime()  {
		return time;
	}

	@Override
	public String toString() {
		return "China{" +
				"place='" + place + '\'' +
				", time=" + time +
				'}';
	}
}