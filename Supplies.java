class Supplies {
	UserInterface ui = new UserInterface();
	availableSupplies supplyType;

	enum availableSupplies {
		FOOD,
		WATER,
		FUEL,
		SPARE_PARTS,
		SPACE_SUITS
	}

	public void purchaseSupplyOf(Object supplyType, int amount) {
		if (supplyType instanceof Food) {
			Food.buyFood(amount);
		} else if (supplyType instanceof Water) {
			Water.buyWater(amount);
		} else if (supplyType instanceof Fuel) {
			Fuel.buyFuel(amount);
		} else if (supplyType instanceof SpaceSuits) {

		} else if (supplyType instanceof SpareParts) {

		} else {
			ui.println("***ERROR: Supplies.buySupplyOf***");
		}
	}

	public void sellSupplyOf(Object supplyType, int amount) {
		if (supplyType instanceof Food) {
			Food.sellFood(amount);
		} else if (supplyType instanceof Water) {
			Water.sellWater(amount);
		} else if (supplyType instanceof Fuel) {
			Fuel.sellFuel(amount);
		} else if (supplyType instanceof SpaceSuits) {

		} else if (supplyType instanceof SpareParts) {

		} else {
			ui.println("***ERROR: Supplies.sellSupplyOf***");
		}
	}

	public void displaySupplies(Food food, Water water) {
		ui.println("Food: " + food.checkFoodSupply());
		ui.println("Water: " + water.checkWaterSupply());
		//ui.println("Fuel: " + fuel.checkFuelSupply());
		//ui.println("Money: " + money.checkMoneySupply());
	}



	public static class Money extends Supplies {
		static int amountOfMoney;
		public Money() {
			Supplies.Money.amountOfMoney = 0;
		}

		public static void buySupplyOf(Object supplyType, int amountDesired) {
			
		}
	}

	public static class Food extends Supplies {
		foodRationSize rationSize;
		public static int foodQuantity;
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
		public static void sellFood(int removeFood) {
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
		public void eatFood(foodRationSize rationSize, int crewSize) {
			int dailyConsumable = 1;
			if (rationSize == foodRationSize.BARE_BONES) {
				dailyConsumable = 1;
			} else if (rationSize == foodRationSize.MEAGER) {
				dailyConsumable = 2;
			} else {
				dailyConsumable = 3;
			}
			foodQuantity = foodQuantity - dailyConsumable * crewSize;
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
		public static void sellWater(int removeFood) {
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
		public static void sellFuel(int newFuel) {
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