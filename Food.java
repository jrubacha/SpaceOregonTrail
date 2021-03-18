class Food {
	String rationSize;
	int availableFood;

	public Food(String rationSize, int availableFood) {
		this.rationSize = rationSize;
		this.availableFood = availableFood;
	}

	public String getRatioSize() {
		return rationSize;
	}
	public int getAvailableFood() {
		return availableFood;
	}
	public void updateRationSize(String newRatioSize){
		this.rationSize = newRatioSize;
	}
	public void printChangeFoodRation(){
		ui.print("Change food rations\n<Currently filling>\nThe amount of food the people in your party eat each day can change. These amounts are:\n1. filling - meals are large and generous\n2. meager - meals are small, but adequate\n3. bare bones - meals are very small; everyone stays hungry.\nWhat is your choice? ");
	}
}