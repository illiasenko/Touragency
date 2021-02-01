package com.solvd.touragency.menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.File;


public class Menu {
	static String separator = File.separator;
	static String pathFirst = "C:" + separator + "Users" + separator + "ilyxa" + separator + "IdeaProjects"
			+ separator + "lesson_7" + separator + "src" + separator + "Visa.txt";
	static String pathSecond = "C:" + separator + "Users" + separator + "ilyxa" + separator + "IdeaProjects"
			+ separator + "lesson_7" + separator + "src" + separator + "List.properties";

	public void show() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			List<Agency> tours = new ArrayList<>();
			boolean flag = true;
			while (flag) {
				System.out.println("======Welcome to the travel agency======\n\tPlease tell me how can I help you:");
				System.out.println(
						"Press 1 - for see all the tours.\nPress 2 - for pick the tour.\nPress 3 - We don't have such tour.");
				System.out.print("Please make you choice: ");
				int selection = Integer.parseInt(reader.readLine());
				switch (selection) {
					case 1:
						Agency tour = new Agency();
						System.out.println("Please enter tour country: ");
						tour.setCountry(reader.readLine());
						System.out.println("Please enter tour days: ");
						tour.setDays(Integer.parseInt(reader.readLine()));
						System.out.println("Please enter tour price: ");
						tour.setPrice(Integer.parseInt(reader.readLine()));
						tours.add(tour);
						break;
					case 2:
						System.out.println("Please enter price: ");
						int price = Integer.parseInt(reader.readLine());
						List<Agency> correctTours = new ArrayList<>();
						for (Agency tour1 : tours) {
							if (tour1.getPrice() <= price) {
								correctTours.add(tour1);
							}
						}
						if (correctTours.isEmpty()) {
							System.out.println("We didn't found correct tour");
						} else {
							System.out.println(correctTours);
						}
						break;
					case 3:
						flag = false;
						System.out.println("Goodbye");
				}
			}
		} catch (IOException e) {
			System.err.println("Input incorrect: " + e.getMessage());
		}
	}
}