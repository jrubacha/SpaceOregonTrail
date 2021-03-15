import java.util.*;
class Crew {
	ArrayList<CrewMember> crewList =  new ArrayList<CrewMember>();
	UserInterface ui = new UserInterface();
	Scanner keyboard = new Scanner(System.in);
	String crewName;

	public Crew() {

	}

	public void createCrew(){
		ui.print("Please type in your crewmates' names.");
		for(int i=0; i<4; i++) {
			crewName = keyboard.next();
			CrewMember person = new CrewMember(crewName, 45, "welder");
			crewList.add(person);
		}
	}
}