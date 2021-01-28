package com.solvd.touragency.menu;

public class Agency {

	private String country;
	private int days;
	private int price;

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Tour{" +
				"country='" + country + '\'' +
				", days=" + days +
				", price=" + price +
				'}';
	}
}
