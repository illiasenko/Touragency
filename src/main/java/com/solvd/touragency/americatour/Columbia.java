package com.solvd.touragency.americatour;

public class Columbia extends America {
	private String place;
	private int time;
	private int price;

	public Columbia() {
	}

	public Columbia(String place, int time, int price) {
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

	@Override
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int getPrice() {
		return price;
	}


	@Override
	public String toString() {
		return "Canada{" +
				"place='" + place + '\'' +
				", time=" + time +
				", price=" + price +
				'}';
	}
}