class TextBlocks {
	UserInterface ui = new UserInterface();

	SpaceCraft saturnV = new SpaceCraft("Saturn V", 160, "Fair", "Large", 20, 3, 10000, 65);
	SpaceCraft atlas = new SpaceCraft("Atlas Falcon", 125, "Fair", "Medium", 40, 4, 15000, 75);
	SpaceCraft shepard = new SpaceCraft("New Shepard XC", 90, "Good", "Small", 75, 6, 30000, 90);
	SpaceCraft artemis = new SpaceCraft("Artemis N", 30, "Great", "Small", 85, 10, 50000, 100);
	SpaceCraft orion = new SpaceCraft("New Orion", 10, "Outstanding", "Medium", 100, 12, 100000, 100);
	SpaceCraft[] earthCraft = {saturnV, atlas, shepard, artemis, orion};

	public void printAllCraftSpecs(){
		for(int i=0; i<earthCraft.length; i++) {
			ui.println("Option #" + (i+1));
			earthCraft[i].printAllSpecs();
		}
	}

	public SpaceCraft getCraft(int userChoice){
		SpaceCraft selectedCraft = shepard;
		switch (userChoice) {
			case 1:
				selectedCraft = saturnV;
				break;
			case 2:
				selectedCraft = atlas;
				break;
			case 3:
				selectedCraft = shepard;
				break;
			case 4:
				selectedCraft = artemis;
				break;
			case 5:
				selectedCraft = orion;
				break;
			case 6:
				selectedCraft = shepard;
				break;
		}
		return selectedCraft;
	}

	public void printGameGreetings() {
		ui.print("Greetings Captain. Will you tell me your name? ");
	}

	public void printWelcomeMessage(String name){
		ui.println("\n\nWelcome Captain " + name + "!\n\nIt’s time for you to make your first voyage to the Jupiter Colony Station. You will need to make many important decisions before leaving Earth, so read carefully.\n\nThere are multiple stages to this journey. Your first steps are to select your ship and crew.\n\nChoose wisely, some of these flight vehicles are meant for short voyages only and others are suitable for long hauls.\n\nYou can also stock up on provisions before leaving. Make sure to budget carefully. It’s a long trip.\n\n= = = = = = = = =");
	}

	public void printCrewPrompt() {
		ui.println("Thanks for selecting your ship. Your next step will be to select your crew. Make sure you bring along enough people for your journey. If you find you need more hands later on, you can always pick up someone from the Moon Base, Mars Colony I, or the Inner Belt Station.\nYou can up to as many people will fit on your ship. Make sure to consider the occupations of your crew members carefully. A well-balanced crew likely will perform better than one that is not.");
	}

	public void printCrewOptions() {
		ui.println("\nWho would you like to hire?\n1. Engineer\n2. Scientist\n3. Communications Officer\n4. Pilot\n5. No more hires");
	}

	public void printLaunchIntro() {
		ui.println("\nThanks for assembling your crew. They'll be ready for you when you take off. Your launch window is two weeks long. The weather forecast will be provided for you on each day.");
	}

	public void printLaunchForecast(int counter){
		printDividerLine();
		ui.println("\nDay #" + counter);
		ui.println("Weather Forecast\n");
	}

	public void printLaunchOptions() {
		ui.println("How would you like to proceed?\n1. Postpone the launch 1 day\n2. Launch Today");
	}

	public void printDividerLine(){
		ui.println("");
		for(int i=0; i<11; i++) {
			ui.print("*");
		}
		ui.println("");
	}

	public void printStandardMenuOptions(int day) {
		ui.println("It is Day #" + day);
		ui.println("What would you like to do?");
		ui.println("1. Continue on your journey");
		ui.println("2. Check supplies");
		ui.println("3. Look at map"); // maybe.
		ui.println("4. Change food rations");
		ui.println("5. Attempt to trade"); // requires commm. Officer
		ui.println("6. Talk to people");
		ui.println("7. Perform ship maintenance");
		ui.println("\nWhat is your choice?");
	}

	public void printStatus() {
		
	}
}