class SpaceCraft {
	private String name;
	private int health, capacity, cost;
	UserInterface ui = new UserInterface();
	navigationQuality navQual;
	shipQuality shipQual;
	shipAge age;
	shipSpeed speed;
	fuelTankSize tankSize;

	public static enum shipSpeed {
		SLOW,
		AVERAGE,
		FAST
	}
	public static enum navigationQuality {
		POOR,
		AVERAGE,
		OUTSTANDING
	}
	public static enum shipQuality {
		POOR,
		AVERAGE,
		OUTSTANDING
	}
	public static enum shipAge {
		VERY_OLD,
		OLD,
		AVERAGE,
		NEW
	}
	public static enum fuelTankSize {
		SMALL,
		MEDIUM,
		LARGE
	}

	public SpaceCraft(String name, shipAge age, shipSpeed speed, shipQuality shipQual, navigationQuality navQual, int capacity, int cost, int health, fuelTankSize tankSize) {
		this.name = name;
		this.age = age;
		this.speed = speed;
		this.shipQual = shipQual;
		this.navQual = navQual;
		this.capacity = capacity;
		this.cost = cost;
		this.health = health;
		this.tankSize = tankSize;
	}
	public String getName() {
		return name;
	}
	public shipAge getAge() {
		return age;
	}
	public int getHealth() {
		return health;
	}
	public int changeHealth(int modVal) {
		health = health + modVal;
		return health;
	}
	public shipQuality getQuality() {
		return shipQual;
	}
	public shipSpeed getSpeed(){
		return speed;
	}
	public int getCost(){
		return cost;
	}
	public int getCapacity(){
		return capacity;
	}
	public navigationQuality getNavQual() {
		return navQual;
	}

	public void printAllSpecs(){
		ui.println(name);
		ui.println("Cost: " + cost);
		ui.println("Capacity: " + capacity);
		ui.println("Condition: " + shipQual);
		ui.println("Speed: " + speed);
		ui.println("= = = = = = = = =");
	}

	public class SaturnV extends SpaceCraft {
		public SaturnV() {
		 	super("Saturn V", shipAge.VERY_OLD, shipSpeed.SLOW, shipQuality.POOR, navigationQuality.POOR, 3, cost, health, fuelTankSize.SMALL);
		}
	}
}