package com.solvd.touragency.americatour;

public class Brasil extends America {
	private String place;
	private int time;
	private int price;

	public Brasil() {
	}

	public Brasil(String place, int time, int price) {
		this.place = place;
		this.time = time;
		this.price = price;
	}

	@Override
	public String getPlace() {
		return place;
	}

	@Override
	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public int getTime() {
		return time;
	}

	@Override
	public void setTime(int time) {
		this.time = time;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Brasil{" +
				"place='" + place + '\'' +
				", time=" + time +
				", price=" + price +
				'}';
	}
}