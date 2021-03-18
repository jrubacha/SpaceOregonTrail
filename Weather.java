import java.util.*;

class Weather {
	// All possible weather conditions
	Rain[] rainList = {new Rain("Clear", 0), new Rain("Clear", 0), new Rain("Clear", 0), new Rain("Clear", 0), new Rain("Clear", 0), new Rain("Light Rain", 50), new Rain("Heavy Rain", 100), new Rain("Hail", 100)};

	Cloud[] cloudList = {new Cloud("Clear", 0), new Cloud("Clear", 0), new Cloud("Clear", 0), new Cloud("Clear", 0), new Cloud("Clear", 0), new Cloud("Mostly Sunny", 10), new Cloud("Partly Cloudy", 20),  new Cloud("Partly Cloudy", 20),  new Cloud("Partly Cloudy", 20), new Cloud("Partly Cloudy", 20), new Cloud("Cloudy", 70),  new Cloud("Cloudy", 70), new Cloud("Cloudy", 70), new Cloud("Overcast", 100)};

	Wind[] windList = {new Wind("Calm", 0), new Wind("Calm", 0), new Wind("Calm", 0), new Wind("Calm", 0), new Wind("Light Breeze", 25), new Wind("Light Breeze", 25), new Wind("Light Breeze", 25), new Wind("Gusty", 80), new Wind("Storm Force", 100)};

	Random rand = new Random();
	UserInterface ui = new UserInterface();

	public Rain establishRainForecast() {
		int rainChance = rand.nextInt(rainList.length);
		Rain rainForecast = rainList[rainChance];
		return rainForecast;
	}
	
	public Cloud establishCloudForecast(){
		int cloudChance = rand.nextInt(cloudList.length);
		Cloud cloudForecast = cloudList[cloudChance];
		return cloudForecast;
	}

	public Wind establishWindForecast(){
		int windChance = rand.nextInt(windList.length);
		Wind windForecast = windList[windChance];
		return windForecast;
	}

	public void printWeatherForecast(Rain rain, Cloud cloud, Wind wind) {
		rain.printRainForecast();
		cloud.printCloudForecast();
		wind.printWindForecast();
	}

	public boolean willLaunchSucceed(int rainChance, int cloudChance, int windChance) {
		// Aka: The "Will You Die" Calculator
		boolean launchStatus = true;
		int diceRoll = rand.nextInt(100);
		int sumChance = rainChance + cloudChance + windChance;
		if (rainChance == 100) {
			launchStatus = false;
		} else if (cloudChance == 100) {
			launchStatus = false;
		} else if (windChance == 100) {
			launchStatus = false;
		} else if (diceRoll < rainChance) {
			launchStatus = false;
		} else if (diceRoll < cloudChance) {
			launchStatus = false;
		} else if (diceRoll < windChance) {
			launchStatus = false;
		} else if (diceRoll < sumChance) {
			launchStatus = false;
		}
		ui.println("cloud: "+ cloudChance + "rain: " + rainChance + "wind: " + windChance + "Dice: " + diceRoll);
		return launchStatus;
		}
}