import java.util.*;
class Crew {
	ArrayList<CrewMember> crewList =  new ArrayList<CrewMember>();
	UserInterface ui = new UserInterface();
	Scanner keyboard = new Scanner(System.in);
	String crewName;
	int crewAge;
	int[] crewMakeup = {0, 0, 0, 0, 1}; // engr, sci, com, pilot, capt

	public Crew() {
	}

	public void modifyCrew(int whichCrew, int num) {
		crewMakeup[whichCrew] = crewMakeup[whichCrew] + num;
	}

	public int getTotalCrew() {
		int sum = 0;
    for(int num : crewMakeup) {
        sum = sum+num;
    }
		return sum;
	}

	public void printCrewList() {
		ui.println("\nYou currently have the following in your crew.");
		ui.println(crewMakeup[0] + " Engineers");
		ui.println(crewMakeup[1] + " Scientists");
		ui.println(crewMakeup[2] + " Communications Officers");
		ui.println(crewMakeup[3] + " Pilots");
		ui.println(crewMakeup[4] + " Captain");
	}

	public void createCrew(int capacity){
		ui.println("Please type in your crewmates' names.");
		for(int i=0; i<capacity; i++) {
			crewName = keyboard.next();
			CrewMember person = new CrewMember(crewName, 45, "welder");
			crewList.add(person);
		}
	}
}