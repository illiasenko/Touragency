package com.solvd.touragency.americatour;

public abstract class America {
	private String place;
	private int time;
	private int price;

	public America() {
	}

	public America(String place, int time) {
		this.place = place;
		this.time = time;
	}

	public America(String place, int time, int price) {
		this.price = price;
		this.place = place;
		this.time = time;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getTime() {
		return time;
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
	public String toString() {
		return "Usa{" +
				"place='" + place + '\'' +
				", time=" + time +
				", price=" + price +
				'}';
	}
}