package com.solvd.touragency.utils;

import java.io.IOException;
import java.nio.file.Paths;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.touragency.worldtour.World;
import org.apache.log4j.Logger;

public class JsonExec {

	private final static Logger LOGGER = Logger.getLogger(JsonExec.class);
	private Object World;

	public String convertJavaToJsonStr(Object obj) {

		String jsonStr = "";

		try {
			jsonStr = new ObjectMapper().writeValueAsString(obj);
			LOGGER.info("convert to string, finished!");

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return jsonStr;
	}

	public void convertJavaToJsonFile(Object obj, String pathToFile) {

		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.writeValue(Paths.get(pathToFile).toFile(), obj);
			LOGGER.info("write to file, finished!");

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public World convertJsonStrToAsiaPOJO(String jsonStr) {
		World world = null;
		try {
			ObjectMapper mapper = new ObjectMapper();
			world = mapper.readValue(jsonStr, World.class);
			LOGGER.info("convert to POJO, finished!");

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return world;
	}
}