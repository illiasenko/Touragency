package com.solvd.touragency.worldtour;

import com.solvd.touragency.americatour.America;
import com.solvd.touragency.eurasiatour.Europe;
import com.solvd.touragency.eurasiatour.Asia;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class World {
	private int time;
	private String place;
	private int price;


	List<Europe> bus;
	List<America> flight;
	Set<Asia> combined;


	public World() {
		flight = new ArrayList<America>();
		bus = new LinkedList<Europe>();
		combined = new HashSet<Asia>();

	}

	public World(Europe europe, America america) {
		bus = new ArrayList<Europe>();
		flight = new LinkedList<America>();
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void addEurope(Europe europe) {
		bus.add(europe);
	}

	public void addAmerica(America america) {
		flight.add(america);
	}

	public void addCombined(Asia asia) {
		combined.add(asia);
	}

	public void removeEurope(Europe europe) {
		bus.remove(europe);
	}

	public void removeAmerica(America america) {
		flight.remove(america);
	}

	public void removeAsia(Asia asia) {
		combined.remove(asia);
	}

	public void printInfo() {
		System.out.println("=====Euro Tour====");

		for (Europe europe : bus) {
			System.out.println(europe.toString());
		}
		System.out.println("=====America Tour======");

		for (America america : flight) {
			System.out.println(america.toString());
			;
		}
		System.out.println("=====Asia Tour======");

		for (Asia asia : combined) {
			System.out.println(asia.toString());
		}
	}
}