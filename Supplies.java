class Supplies {
	private int food, water, fuel, spareParts, spaceSuits;
	private int[] suppliesArray = {food, water, fuel, spareParts, spaceSuits};
	private String[] suppliesNames = {"Food", "Water", "Fuel", "Spare Parts", "Space Suits"};
	UserInterface ui = new UserInterface();

	// Food Methods
	public void modifyFood(int foodMod) {
		food = food + foodMod;
	}
	public int getFoodValue(){
		return food;
	}
	

	// Water Methods
	public void modifyWater(int waterMod) {
		water = water + waterMod;
	}
	public int getWaterValue() {
		return water;
	}

	// Fuel Methods
	public void modifyFuel(int fuelMod){
		fuel = fuel + fuelMod;
	}
	public int getFuelValue() {
		return fuel;
	}

	// Spart Parts Methods
	public void modifySpareParts(int sparePartsMod){
		spareParts = spareParts + sparePartsMod;
	}
	public int getSparePartsValue(){
		return spareParts;
	}

	// Space Suit Methods
	public void modifySpaceSuits(int spaceSuitsMod){
		spaceSuits = spaceSuits + spaceSuitsMod;
	}
	public int getSpaceSuitsValue() {
		return spaceSuits;
	}

	// All Supplies Methods
	public void printSuppliesQuantities() {
		for(int i=0; i<suppliesArray.length; i++) {
			ui.println(suppliesArray[i] + " " + suppliesNames[i]);
		}
	}
}