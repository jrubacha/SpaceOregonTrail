import java.util.*;
class Food {
	private String rationSize;
	private int availableFood;
	UserInterface ui = new UserInterface();
	Scanner keyboard = new Scanner(System.in);

	public Food(String rationSize, int availableFood) {
		this.rationSize = rationSize;
		this.availableFood = availableFood;
	}

	public String getRationSize() {
		return rationSize;
	}
	public int getAvailableFood() {
		return availableFood;
	}
	public void updateRationSize(String newRatioSize){
		this.rationSize = newRatioSize;
	}
	public String changeFoodRation(){
		ui.print("Change food rations\n<Currently filling>\nThe amount of food the people in your party eat each day can change. These amounts are:\n1. filling - meals are large and generous\n2. meager - meals are small, but adequate\n3. bare bones - meals are very small; everyone stays hungry.\nWhat is your choice? ");
		int userChoice = keyboard.nextInt();
		switch (userChoice) {
			case 1:
				rationSize = "Filling";
				break;
			case 2:
				rationSize = "Meager";
				break;
			case 3:
				rationSize = "Bare Bones";
				break;
			default:
				rationSize = "Meager";
				break;
		}
		return rationSize;
	}
}