package com.solvd.touragency.menu;

import com.solvd.touragency.americatour.America;
import com.solvd.touragency.americatour.Columbia;
import com.solvd.touragency.eurasiatour.*;
import com.solvd.touragency.americatour.Usa;
import com.solvd.touragency.utils.JsonExec;
import com.solvd.touragency.worldtour.World;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


public class Catalog {

	private final static Logger LOGGER = Logger.getLogger(Catalog.class);

	public static void newCatalog() {
		World world = new World();

		Asia asia = new Asia();

		Europe europe = new Europe("EuroTour", 12, 900);
		Europe portugal = new Portugal("Portugal", 10, 550);
		Europe spain = new Spain("Spain", 10, 600);
		Europe italy = new Italy("Italy", 10, 400);
		Europe ukraine = new Ukraine("Ukraine", 10, 750);
		America usa = new Usa("United States", 10, 1500);
		America canada = new Usa("Canada", 10, 1500);
		America columbia = new Columbia("Columbia", 13, 1600);
		Asia thailand = new Thailand("Thailand", 12, 800);


		europe.addEurope(portugal);
		europe.addEurope(spain);
		europe.addEurope(italy);
		europe.addEurope(ukraine);

		List<World> worldList = new ArrayList<World>();
		worldList.add(portugal);
		worldList.add(spain);
		worldList.add(ukraine);
		worldList.add(italy);

		LOGGER.info(europe.getPrice());
		LOGGER.info("=============");


		JsonExec jsonAction = new JsonExec();
		String jsonSrt = jsonAction.convertJavaToJsonStr(europe);

		LOGGER.info(jsonSrt);
		LOGGER.info("================");
		jsonAction.convertJavaToJsonFile(europe, "world.json");

		jsonAction.convertJavaToJsonFile(worldList, "worldlist.json");

		String jsonStr1 = "{\"time\":12,\"place\":\"Asia\",\"price\":1000}";
		World world2 = jsonAction.convertJsonStrToAsiaPOJO(jsonStr1);
		LOGGER.info("Name time from POJO: " + world2.getTime());
		LOGGER.info("Name place from POJO: " + world2.getPlace());
		LOGGER.info("Name price from POJO: " + world2.getPrice());

	}
}