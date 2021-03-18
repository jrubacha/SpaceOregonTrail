class Wind {
	private String windCondition;
	private int riskFactor;
	UserInterface ui = new UserInterface();

	public Wind (String windCondition, int riskFactor) {
		this.windCondition = windCondition;
		this.riskFactor = riskFactor;
	}

	public String getWindCondition(){
		return windCondition;
	}

	public int getRiskFactor() {
		return riskFactor;
	}

	public void printWindForecast() {
		ui.println("The current wind condition is " + windCondition + ".");
	}
}