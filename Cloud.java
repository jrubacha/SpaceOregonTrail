class Cloud {
	private String cloudCondition;
	private int riskFactor;
	UserInterface ui = new UserInterface();

	public Cloud (String cloudCondition, int riskFactor) {
		this.cloudCondition = cloudCondition;
		this.riskFactor = riskFactor;
	}

	public String getCloudCondition(){
		return cloudCondition;
	}

	public int getRiskFactor() {
		return riskFactor;
	}

	public void printCloudForecast(){
		ui.println("The current cloud coverage is " + cloudCondition + ".");
	}

}