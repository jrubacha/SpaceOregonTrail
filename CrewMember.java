class CrewMember {
	private String name, occupation;
	private int age, health;
	
	public CrewMember(String name, int age, String occupation) {
		this.name = name;
		this.age = age;
		this.occupation = occupation;

		// Starting Health values. Based on age only.
		if (age > 90) {
			health = 20;
		} else if (age > 65) {
			health = 50;
		} else if (age > 30) {
			health = 95;
		} else if (age > 18) {
			health = 99;
		} else {	// aka, you a baby and more fragile.
			health = 80;
		}
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
}