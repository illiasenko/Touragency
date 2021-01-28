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


	List<Europe> bus;
	List<America> flight;
	Set<Asia> combined;

	public  int time = 14;

	public World() {
		flight = new ArrayList<America>();
		bus = new LinkedList<Europe>();
		combined = new HashSet<Asia>();

	}

	public World(Europe europe, America america ) {
		bus = new ArrayList<Europe>();
		flight = new LinkedList<America>();
		time ++;
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
	public void printInfo() {
		System.out.println("=====Euro Tour====");

		for (Europe europe : bus) {
			System.out.println(europe.toString());
		}
		System.out.println("=====America Tour======");

		for (America america : flight) {
			System.out.println(america.toString());;
		}
		System.out.println("=====Summer Tour======");

		for (Asia asia : combined) {
			System.out.println(asia.toString());
		}
	}
}