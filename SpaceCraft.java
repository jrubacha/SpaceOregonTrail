class SpaceCraft {
	private String name, quality, size, occupation;
	private int health, speed, navQual, age;

	public SpaceCraft(String name, int age, String quality, String size, int navQual) {
		this.name = name;
		this.size = size;
		this.quality = quality;
		this.navQual = navQual;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getOccupation() {
		return occupation;
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
}