class Supplies {
	private int food, water, fuel, spareParts, spaceSuits;
	private int[] suppliesArray = {food, water, fuel, spareParts, spaceSuits};
	private String[] suppliesNames = {"Food", "Water", "Fuel", "Spare Parts", "Space Suits"};
	UserInterface ui = new UserInterface();
	availableSupplies supplyType;

	enum availableSupplies {
		FOOD,
		WATER,
		FUEL,
		SPARE_PARTS,
		SPACE_SUITS
	}

	public void increaseSupplyOf(Object supplyType, int amount) {
		if (supplyType instanceof Food) {
			Food.buyFood(amount);
		} else if (supplyType instanceof Water) {
			Water.buyWater(amount);
		} else if (supplyType instanceof Fuel) {
			Fuel.buyFuel(amount);
		} else if (supplyType instanceof SpaceSuits) {

		} else if (supplyType instanceof SpareParts) {

		} else {
			ui.println("***ERROR: Supplies.increaseSupplyOf***");
		}
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

	public static class Food extends Supplies {
		foodRationSize rationSize;
		static int foodQuantity;
		public static enum foodRationSize {
			FILLING,
			MEAGER,
			BARE_BONES
		}
		public Food(foodRationSize rationSize, int foodQuantity){
			this.rationSize = rationSize;
			Supplies.Food.foodQuantity = foodQuantity;
		}
		public static void buyFood(int newFood) {
			foodQuantity = foodQuantity + newFood;
		}
		public void sellFood(int removeFood) {
			foodQuantity = foodQuantity - removeFood;
		}
		public void changeRationSize(foodRationSize rationSize) {
			this.rationSize = rationSize;
		}
		public int checkFoodSupply(){
			return foodQuantity;
		}
		public String checkFoodRationSize(){
			String ration = rationSize.toString();
			return ration;
		}
	}

	public static class Water extends Supplies {
		waterRationSize rationSize;
		static int waterQuantity;
		public static enum waterRationSize {
			HYDRATED,
			THIRSTY,
			PARTCHED
		}
		public Water(waterRationSize rationSize, int waterQuantity) {
			this.rationSize = rationSize;
			Supplies.Water.waterQuantity = waterQuantity;
		}
		public static void buyWater(int newWater) {
			waterQuantity += newWater;
		}
		public void sellWater(int removeFood) {
			waterQuantity -= removeFood;
		}
		public void changeRationSize(waterRationSize rationSize) {
			this.rationSize = rationSize;
		}
		public int checkWaterSupply(){
			return waterQuantity;
		}
		public String checkWaterRationSize(){
			String ration = rationSize.toString();
			return ration;
		}
	}

	public static class Fuel extends Supplies {
		fuelTankSize tankSize;
		static int fuelQuantity;
		public static enum fuelTankSize {
			SMALL,
			MEDIUM,
			LARGE
		}
		public Fuel(fuelTankSize tankSize, int fuelQuantity) {
			this.tankSize = tankSize;
			Supplies.Fuel.fuelQuantity = fuelQuantity;
		}
		public static void buyFuel(int newFuel) {
			fuelQuantity += newFuel;
		}
		public void sellFuel(int newFuel) {
			fuelQuantity -= newFuel;
		}
		public int checkFuelSupply(){
			return fuelQuantity;
		}
		public String checkFuelTankSize(){
			String tank = tankSize.toString();
			return tank;
		}
	}

	public static class SpaceSuits extends Supplies {

	}

	public static class SpareParts extends Supplies {
		
	}
}