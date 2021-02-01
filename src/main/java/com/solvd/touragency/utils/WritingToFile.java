package com.solvd.touragency.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WritingToFile {

	public void writeToFile(String pathFirst, String place) {

		File file = new File(pathFirst);
		try {
			PrintWriter pw = new PrintWriter(file);
			pw.println(place);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}