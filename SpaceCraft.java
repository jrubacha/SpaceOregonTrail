class SpaceCraft {
	private String name, quality, size, occupation;
	private int health, speed, navQual, age, capacity, cost;
	UserInterface ui = new UserInterface();

	public SpaceCraft(String name, int age, String quality, String size, int navQual, int capacity, int cost, int health) {
		this.name = name;
		this.size = size;
		this.quality = quality;
		this.navQual = navQual;
		this.capacity = capacity;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getHealth() {
		return health;
	}
	public int changeHealth(int modVal) {
		health = health + modVal;
		return health;
	}
	public String getQuality() {
		return quality;
	}
	public String getSize() {
		return size;
	}
	public int getSpeed(){
		return speed;
	}

	public int getCost(){
		return cost;
	}

	public int getCapacity(){
		return capacity;
	}

	public int getNavQual() {
		return navQual;
	}

	public void printAllSpecs(){
		ui.println(name);
		ui.println("Cost: " + cost);
		ui.println("Capacity: " + capacity);
		ui.println("Condition: " + quality);
		ui.println("Speed: " + speed);
		ui.println("= = = = = = = = =");
	}
}