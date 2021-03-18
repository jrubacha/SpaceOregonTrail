class Rain {
	private String rainCondition;
	private int riskFactor;
	UserInterface ui = new UserInterface();

	public Rain (String rainCondition, int riskFactor) {
		this.rainCondition = rainCondition;
		this.riskFactor = riskFactor;
	}

	public String getRainCondition(){
		return rainCondition;
	}

	public int getRiskFactor() {
		return riskFactor;
	}

	public void printRainForecast() {
		ui.println("The current precipitation condition is " + rainCondition + ".");
	}
}