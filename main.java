import java.util.*;


class Main {
  public static void main(String[] args) {
    UserInterface ui = new UserInterface();
		Crew crew1 = new Crew();
		TextBlocks text = new TextBlocks();
		Weather weather = new Weather();
		Scanner keyboard = new Scanner(System.in);
		Supplies supplies = new Supplies();
		
		text.printGameGreetings();
		String captainName = keyboard.next();
		text.printWelcomeMessage(captainName);
		text.printAllCraftSpecs();
		int userChoice = keyboard.nextInt();
		int userChoice2 = 0;

		// Buy Space Craft
		SpaceCraft firstCraft = text.getCraft(userChoice);
		userChoice = 0; // reset userChoice

		// Hire Crew
		text.printCrewPrompt();
		int canHire = firstCraft.getCapacity() - 1;
		while (userChoice != 5) {
			text.printCrewOptions();
			ui.println("You can hire "+ canHire + " crew members.");
			userChoice = keyboard.nextInt();
			if (userChoice != 5) {
				ui.print("Great. How many would you like to hire? ");
				userChoice2 = keyboard.nextInt();
				if (userChoice2 > canHire) {
					ui.println("I'm sorry. You can't hire that many.");
				} else {
					crew1.modifyCrew((userChoice-1), userChoice2);
				}
			} else if (canHire == (firstCraft.getCapacity() - 1)){
				ui.println("You haven't added any crew. Are you sure you want to exit?\n1. Yes\n2. No");
				userChoice = keyboard.nextInt();
				if (userChoice != 1) {
					userChoice = 0;
				} else {
					userChoice = 5;
				}
			}
			canHire -= userChoice2;
		}
		crew1.printCrewList();

		userChoice = 0;
		int launchCounter = 1;
		text.printLaunchIntro();
		Cloud currentCloud = weather.establishCloudForecast();
		Wind currentWind = weather.establishWindForecast();
		Rain currentRain = weather.establishRainForecast();
		while (userChoice != 2 && launchCounter < 15) {
			// New Day's Weather
			currentCloud = weather.establishCloudForecast();
			currentWind = weather.establishWindForecast();
			currentRain = weather.establishRainForecast();
			text.printLaunchForecast(launchCounter);
			weather.printWeatherForecast(currentRain, currentCloud, currentWind);
			launchCounter++;
			text.printLaunchOptions();
			userChoice = keyboard.nextInt();
		}

		if (launchCounter > 14) {
			ui.println("You postponed the launch too long and missed your launch window! It takes time for multiple planetary orbits to align, you know!");
		} else if (weather.willLaunchSucceed(currentRain.getRiskFactor(), currentCloud.getRiskFactor(), currentWind.getRiskFactor())) {
			ui.println("Congrats. The launch was successful.");
		} else {
			ui.println("u ded.");
		}

		int daysCounter = 1;
		userChoice = 0;
		userChoice2 = 0;
		boolean isAlive = true;	// player state

		supplies.printSuppliesQuantities();

		while (daysCounter < 5 && isAlive) {
			text.printStandardMenuOptions(daysCounter);
			daysCounter++;
			userChoice = keyboard.nextInt();
			switch (userChoice) {
				case 1:
					break;
				case 2:
					supplies.printSuppliesQuantities();
					break;
				case 3:
					break;
				case 4:
					
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				default:
					break;
			}
		}


		//crew1.createCrew(firstCraft.getCapacity());
  }
}