class CrewMember {
	private String name;
	private int age, health;
	occupation job;

	public static enum occupation {
		ENGINEER,
		SCIENTIST,
		COMMUNICATIONS_OFFICER,
		PILOT,
		CAPTAIN
	}

	public CrewMember(String name, int age, occupation job) {
		this.name = name;
		this.age = age;
		this.job = job;

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
	public occupation getOccupation() {
		return job;
	}
	public int getHealth() {
		return health;
	}
	public int changeHealth(int modVal) {
		health = health + modVal;
		return health;
	}
}